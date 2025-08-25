package Usermadetests.Textbook;

import org.junit.Before;
import org.junit.Test;

import objects.Textbook;
import objects.observer;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class Textbooktests {
    private Textbook textbook;
    
    @Before
    public void setUp() {
        textbook = new Textbook(1, "CS101", "1st Edition");
    }

    @Test
    public void testGetId() {
        assertEquals(1, textbook.getId());
    }

    @Test
    public void testGetCourseId() {
        assertEquals("CS101", textbook.getCourseId());
    }

    @Test
    public void testGetEdition() {
        assertEquals("1st Edition", textbook.getEdition());
    }

    @Test
    public void testAttachObserver() {
        // Mock observer
        observer mockObserver = new observer() {
            @Override
            public void update() {
                // Do nothing for now
            }
        };
        
        // Attach observer
        textbook.attachObserver(mockObserver);
        
        // Ensure observer is attached
        List<observer> observers = textbook.getObservers();
        assertTrue(observers.contains(mockObserver));
    }
}
