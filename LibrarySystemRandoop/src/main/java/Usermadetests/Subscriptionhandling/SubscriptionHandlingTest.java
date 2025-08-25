package Usermadetests.Subscriptionhandling;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


import objects.Newsletter;
import objects.Newsletter.LetterPublisher;
import objects.PaymentOption;
import objects.PaymentType;
import objects.Student;
import objects.Subscription;
import objects.User.UserType;
import userHandling.SubscriptionHandling;

public class SubscriptionHandlingTest {
    private Student testUser;
    private Newsletter testNewsletter;
    private PaymentOption testPaymentOption;
    private Subscription testSubscription;

    @Before
    public void setUp() {
        testUser = new Student(1, "John", "Doe", UserType.STUDENT);
        testPaymentOption = new PaymentOption(1, 100.0, PaymentType.CREDIT);
        testSubscription = new Subscription(testUser, testNewsletter, testPaymentOption);
        testNewsletter = new Newsletter(LetterPublisher.NYTIMES, 10);
        testUser.subscribe(testNewsletter);
        
    }

   
    @Test
    public void testsetcost()
    {
    	testNewsletter.setCost(20);
    	assertTrue(testNewsletter.getCost() == 20);
    }
    @Test
    public void testIsSubscribed_PositiveCase() {
        assertTrue(SubscriptionHandling.isSubscribed(testUser, testNewsletter));
    }
    
    // Additional test cases can be added for other methods if necessary
}
