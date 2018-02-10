package com.example.sam.password_validator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    //Testing that it catches password lowercase
    public void is_password_password() throws Exception {
        assertEquals(0,Validator.passwordpassword("password"));
    }
    @Test
    //Testing that it catches password Uppercase
    public void is_password_password2() throws Exception {
        assertEquals(0, Validator.passwordpassword("Password") );
    }
    @Test
    //Testing that it allows not "password"
    public void is_password_password3() throws Exception {
        assertEquals(1,Validator.passwordpassword("hello123"));
    }



    @Test
    //testing for string is 8 characters
    public void rule2pass() throws Exception {
        assertEquals(1, Validator.rule2("12345678"));

    }
    @Test
    //Testing that points are given for passing rule 1 but not rule 2
    public void rule1passonly() throws Exception {
        assertEquals(1, Validator.validate("hello"));
    }

    @Test
    //Testing that password has at least one number
    public void rule3pass() throws Exception {
        assertEquals(1, Validator.onenumber("Hello1"));
    }
    @Test
    //Testing rule 3 works on just numbers
    public void rule3justnumbers() throws Exception{
        assertEquals(1, Validator.onenumber("626262"));
    }
    @Test
    //Testing rule 3 returns false if no numbers
    public void rule3nonumbers() throws Exception{
        assertEquals(0,Validator.onenumber("Hi"));
    }
    @Test
    //Get all the points when passing all 3 rules
    public void pass3rules() throws Exception{
        assertEquals(3,Validator.validate("qunny123"));
    }
    @Test
    // Rule 4 fails strings that don't start with a capital
    public void nocapital() throws Exception{
        assertEquals(0,Validator.firstcapital("oSls"));
    }
    @Test
    // Rule 4 passes strings that does start with a capital
    public void yescapital() throws Exception{
        assertEquals(1,Validator.firstcapital("SSs"));
    }
    @Test
    //String passes 4 rules
    public void pass4rules() throws Exception{
        assertEquals(4,Validator.validate("Funny123"));
    }
    @Test
    // Rule 5 doesn't pass strings without an @ as the third character
    public void pass5rule() throws Exception{
        assertEquals(0,Validator.thirdat("heeep"));
    }
    @Test
    // Rule 5 doesn't pass strings with less then 3 characters
    public void pass5rule2() throws Exception{
        assertEquals(0,Validator.thirdat("@@"));
    }
    @Test
    //Rule 5 doesn't pass strings with @ characters everywhere except the 3rd character
    public void pass5rule3() throws Exception{
        assertEquals(0, Validator.thirdat("@@k@@@@@"));
    }
    @Test
    //Rule 5 passes strings with an @ as the third character
    public void pass5rulegood() throws Exception{
        assertEquals(1, Validator.thirdat("Hi@33innl"));
    }
    @Test
    //Validator Awards all 5 points if every rule is passed
    public void passall() throws Exception{
        assertEquals(5, Validator.validate("H2@iswater"));
    }
}