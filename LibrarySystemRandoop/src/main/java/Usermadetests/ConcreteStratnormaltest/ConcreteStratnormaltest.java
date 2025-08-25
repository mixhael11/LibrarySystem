package Usermadetests.ConcreteStratnormaltest;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import objects.Book;
import objects.BorrowingRecord;
import objects.ConcreteStratNormal;
import objects.PhysicalItem;
import objects.User;
import objects.UserCreationFactory;
import objects.User.UserType;
import userHandling.BorrowingRecordHandling;
import java.util.ArrayList;

public class ConcreteStratnormaltest {

    private ConcreteStratNormal concreteStratNormal;
    private User user;
    private PhysicalItem item;

    @Before
    public void setUp() {
        concreteStratNormal = new ConcreteStratNormal();
        user = UserCreationFactory.getDetails(1, "student@example.com", "password", UserType.STUDENT);
        item = new Book(10,  "POGGESR", "LIBRARY", 10, 15.00, "2020323020");
    }

    @Test
    public void testExecute() {
        // Execute the strategy
        concreteStratNormal.execute(user, item);

        // Check if the borrowing record was removed
        ArrayList<BorrowingRecord> records = user.updateBorrowingRecords();
        assertTrue(records.isEmpty()); // Assuming the borrowing record was removed
    }
}
