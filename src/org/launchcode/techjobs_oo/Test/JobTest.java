package org.launchcode.techjobs_oo.Test;

import org.launchcode.techjobs_oo.*;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.lang.System.*;
import java.util.HashMap;


public class JobTest {
    Job test_job1, test_job2, test_job3, test_job4, test_job5;

    @Before
    public void createJobObject() {
        test_job1 = new Job("Junior Web Developer",new Employer("Cozy"),new Location("Portland"),new PositionType("Web - Front End"),new CoreCompetency("Ruby"));
        test_job2 = new Job("Web Developer",new Employer("Atomic Dust,"),new Location("Saint Louis"),new PositionType("Web - Full Stack"),new CoreCompetency("JavaScript"));
        test_job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        test_job4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        test_job5 = new Job("Product tester", new Employer("ACME"), new Location(""), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }

    @Test
    public void testSettingJobId() {
        // Test the two jobIDs differ by 1
        assertEquals(test_job1.getId() + 1, test_job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        // Test the constructor correctly assigns the class and value of each field

        //test the String name
        assertEquals("Product tester", test_job3.getName());
        //test the object Employer
        assertTrue(test_job3.getEmployer() instanceof Employer);// test the return of the instance of Employer
        assertEquals("ACME", test_job3.getEmployer().getValue());//expected value is the input value
        //test the object Location
        assertTrue(test_job3.getLocation() instanceof Location);
        assertEquals("Desert", test_job3.getLocation().getValue());
        //test the object PositionType
        assertTrue(test_job3.getPositionType() instanceof PositionType);
        assertEquals("Quality control", test_job3.getPositionType().getValue());
        //test the object CoreCompetency
        assertTrue(test_job3.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("Persistence", test_job3.getCoreCompetency().getValue());
    }
    //Test for equals method
    @Test
    public void testJobForEquality() {
        assertFalse(test_job3.equals(test_job4));
    }

    // Test for toString
    @Test
    public void testToString1() {
        assertEquals(true, test_job5.toString().startsWith("\n"));
    }

    @Test
    public void testToString2() {
        assertEquals(true, test_job5.toString().endsWith("\n"));
    }
    @Test
    public void testToString3() {
        assertEquals(false,test_job5.getName().equals(""));
        assertEquals(false,test_job5.getEmployer().getValue().equals(""));
        assertEquals(false,test_job5.getLocation().getValue().equals(""));
        assertEquals(false,test_job5.getPositionType().getValue().equals(""));
        assertEquals(false,test_job5.getCoreCompetency().getValue().equals(""));
    }
}