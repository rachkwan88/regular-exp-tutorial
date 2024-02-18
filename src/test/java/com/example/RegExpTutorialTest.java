package com.example;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;


import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class RegExpTutorialTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testValidPhoneNumber()
    {
        RegExpTutorial tutorial = new RegExpTutorial();
        assertTrue(tutorial.validatePhoneNumber("408-123-4567") );
        assertTrue(tutorial.validatePhoneNumber("408.123.4567") );
        assertTrue(tutorial.validatePhoneNumber("(408)1234567") );
        assertTrue(tutorial.validatePhoneNumber("408)1234567") );
        assertTrue(tutorial.validatePhoneNumber("408)123.4567") );
        assertTrue(tutorial.validatePhoneNumber("((408)123.4567") );

    }

    @Test
    public void testInvalidPhoneNumber()
    {
        RegExpTutorial tutorial = new RegExpTutorial();
        assertFalse(tutorial.validatePhoneNumber("a4081234567") );
        assertFalse(tutorial.validatePhoneNumber("81234567") );
        assertFalse(tutorial.validatePhoneNumber("40(B)123.4567") );
        assertFalse(tutorial.validatePhoneNumber("000d") );
        assertFalse(tutorial.validatePhoneNumber("apple-banana-pear") );
        assertFalse(tutorial.validatePhoneNumber("4-081-234-5-67") );



    }

    @Test
    public void testValidEmail()
    {
        RegExpTutorial tutorial = new RegExpTutorial();
        assertTrue(tutorial.validateEmail("rachkwan88@gmail.com"));
        assertTrue(tutorial.validateEmail("abc@abc.com"));
        assertTrue(tutorial.validateEmail("abc@abc.abc.com"));
        assertTrue(tutorial.validateEmail("....@HELLO.org"));
    }

    @Test
    public void testInvalidEmail()
    {
        RegExpTutorial tutorial = new RegExpTutorial();
        assertFalse(tutorial.validateEmail("rachkwan88gmail.com"));
        assertFalse(tutorial.validateEmail("91384"));
        assertFalse(tutorial.validateEmail("abcdkajlfek"));
        assertFalse(tutorial.validateEmail("......."));
        assertFalse(tutorial.validateEmail("@@@@@@@@@"));
        assertFalse(tutorial.validateEmail("rachel@bisv"));
        assertFalse(tutorial.validateEmail("00-@11"));
        assertFalse(tutorial.validateEmail("@@@@@@h"));



    }


}
