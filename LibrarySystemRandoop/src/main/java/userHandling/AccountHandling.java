package userHandling;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import objects.Faculty;
import objects.NonFacultyStaff;
import objects.Student;
import objects.SystemManagerUser;
import objects.User;
import objects.User.UserType;
import objects.Visitor;

public class AccountHandling {

  private static AccountHandling handler = new AccountHandling();

  private static final String CSV_FILE = "./users.csv";

  private AccountHandling() {
  }

  public static AccountHandling getInstance() {
    return handler;
  }

  public static boolean validatePassword(String password) {
    if (password.length() < 8) {
      return false;
    }

    // Check if the password contains at least one uppercase letter
    Pattern uppercasePattern = Pattern.compile("[A-Z]");
    Matcher uppercaseMatcher = uppercasePattern.matcher(password);
    if (!uppercaseMatcher.find()) {
      return false;
    }

    // Check if the password contains at least one lowercase letter
    Pattern lowercasePattern = Pattern.compile("[a-z]");
    Matcher lowercaseMatcher = lowercasePattern.matcher(password);
    if (!lowercaseMatcher.find()) {
      return false;
    }

    // Check if the password contains at least one digit
    Pattern digitPattern = Pattern.compile("\\d");
    Matcher digitMatcher = digitPattern.matcher(password);
    if (!digitMatcher.find()) {
      return false;
    }
    Pattern symbolPattern = Pattern.compile(
        "[!@#$%^&*()\\-+=_{}|\\[\\]:;<>,.?/~]");
    Matcher symbolMatcher = symbolPattern.matcher(password);
    if (!symbolMatcher.find()) {
      return false;
    }

    return true; // Password meets all criteria
  }

  public static ValidationStatus updateValidation(String email) {
    try {
      File inputFile = new File(CSV_FILE);

      BufferedReader reader = new BufferedReader(new FileReader(inputFile));
      StringBuilder sb = new StringBuilder();
      String lineToSearch = email;
      String currentLine;
      boolean found = false;

      while ((currentLine = reader.readLine()) != null) {
        String[] userInfo = currentLine.split(",");
        // Check if the current line contains the provided email
        if (userInfo.length >= 2 && userInfo[1].equals(lineToSearch)) {
          userInfo[4] = "true"; // Update the validation status to true
          currentLine = String.join(",", userInfo);
          found = true;
        }
        sb.append(currentLine).append("\n");
      }

      reader.close();

      // Write the modified contents back to the original file
      FileWriter writer = new FileWriter(inputFile);
      writer.write(sb.toString());
      writer.close();

      return found ? ValidationStatus.SUCCESS : ValidationStatus.FAILURE;
    } catch (IOException e) {
      e.printStackTrace();
      return ValidationStatus.FAILURE;
    }
  }

  public static enum ValidationStatus {
    SUCCESS,
    FAILURE
  }

  public static void createAccount(
      String email,
      String password,
      UserType userType) {
    int id = getLastId() + 1;
    String line;
    if (userType == UserType.SYSTEM_MANAGER) {
      line = id + "," + email + "," + password + "," + userType + ",true";
    } else {
      line = id + "," + email + "," + password + "," + userType + ",false";
    }

    // Check if the file exists
    File file = new File(CSV_FILE);
    boolean fileExists = file.exists();

    try (PrintWriter writer = new PrintWriter(new FileWriter(file, true))) {
      // If the file exists, just append the new account information
      if (fileExists) {
        writer.println(line);
      } else { // If the file doesn't exist, create it and write to it
        file.createNewFile();
        writer.println(line);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static int getLastId() {
    File file = new File(CSV_FILE);
    if (!file.exists()) {
      // File does not exist, return null
      return 0;
    }

    int lastId = 0;
    try (BufferedReader reader = new BufferedReader(new FileReader(CSV_FILE))) {
      String line;
      while ((line = reader.readLine()) != null) {
        String[] parts = line.split(",");
        int userId = Integer.parseInt(parts[0]);
        if (userId > lastId) {
          lastId = userId;
        }
      }
    } catch (IOException | NumberFormatException e) {
      // Handle exceptions
      e.printStackTrace();
    }
    return lastId;
  }

  public static boolean isEmailTaken(String email) {
    File file = new File(CSV_FILE);
    if (!file.exists()) {
      // File does not exist, return false
      return false;
    }

    try (BufferedReader reader = new BufferedReader(new FileReader(CSV_FILE))) {
      String line;
      while ((line = reader.readLine()) != null) {
        String[] parts = line.split(",");
        if (parts[1].equals(email)) {
          return true;
        }
      }
    } catch (IOException e) {
      // Handle exceptions
      e.printStackTrace();
    }
    return false;
  }

  public static boolean validateEmail(String email) {
    // Regular expression for email validation
    String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
    Pattern pattern = Pattern.compile(emailRegex);
    Matcher matcher = pattern.matcher(email);
    return matcher.matches();
  }
}
