package Usermadetests.Usertests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import objects.BorrowingRecord;
import objects.Newsletter;
import objects.Newsletter.LetterPublisher;
import objects.PaymentOption;
import objects.PaymentType;
import objects.Student;
import objects.User;
import objects.User.UserType;
import objects.UserCreationFactory;

public class Usertest {
    private User user = UserCreationFactory.getDetails(1, "student@example.com", "password", UserType.STUDENT);

    @Before
    public void setUp() {
         assertNotNull(user);
         assertTrue(user instanceof Student);
    }

    @Test
    public void testGetId() {
        assertEquals(1, user.getId());
    }

    @Test
    public void testGetEmail() {
        assertEquals("student@example.com", user.getEmail());
    }

    @Test
    public void testGetUserType() {
        assertEquals(UserType.STUDENT, user.getUserType());
    }

    @Test
    public void testGetPassword() {
        assertEquals("password", user.getPassword());
    }

    @Test
    public void testGetValidationStatus() {
        assertFalse(user.getValidationStatus());
    }

    @Test
    public void testSetValidationStatus() {
        user.setValidationStatus(true);
        assertTrue(user.getValidationStatus());
    }

    @Test
    public void testUpdateBorrowingRecords() {
        ArrayList<BorrowingRecord> records = user.updateBorrowingRecords();
        assertEquals(0, records.size()); // Assuming borrowingRecords starts empty
    }

    @Test
    public void testMoreThanThreeOverdueItems() {
       
    }

    @Test
    public void testSendRequest() {
        
    }

    @Test
    public void testSubscribe() {
    	Newsletter news = new Newsletter(LetterPublisher.NYTIMES, 10);
    	user.subscribe(news);
    	assertTrue(user.getSubscriptions().contains(news));
     
    }

    @Test
    public void testUnSubscribe() {
    	Newsletter news = new Newsletter(LetterPublisher.NYTIMES, 10);
    	user.subscribe(news);
    	assertTrue(user.getSubscriptions().contains(news));
    	user.unSubscribe(news);
    	assertFalse(user.getSubscriptions().contains(news));
    	
    }

    @Test
    public void testAddPaymentMethod() {
    	user.addPaymentMethod(PaymentType.CREDIT, 10.00);
    	assertFalse(user.getPaymentOptions().contains(PaymentType.CREDIT));
    	
    	
        
    }

    @Test
    public void testVisit() {
       
    }
}
