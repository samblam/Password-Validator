package com.example.sam.password_validator;


/**
 * Created by Sam on 2018-02-09.
 */

public class Validator {

    private String pass;
    public static int rulecount = 0;
    //constructor
    public Validator(String x){
        set_pass(x);
    }
    public  void set_pass(String input){

        pass = input;

    }
    public String get_pass(){
        return pass;
    }
    //Gives one "point" if the password isn't password or Password
    public static int passwordpassword(String x) {
        if (x == "password" || x == "Password") {
            return 0;
        } else {
            return 1;
        }
    }
    //Gives one point if the password is 8 characters or longer
    public static int rule2(String x){
        if(x.length() < 8){
            return 0;
        }
        else{
            return 1;
        }
    }
    //Gives a point if there is at least one digit in the password
    public static int onenumber(String x) {
        int i = 0;

        for(i = 0;i < x.length();i++){
            if(Character.isDigit(x.charAt(i))){
                return 1;
            }

        }
        return 0;

    }
    //Gives a point if the first character is a capital letter
    public static int firstcapital(String x){
        if(Character.isUpperCase(x.charAt(0))){
            return 1;
        }
        else return 0;
    }
    //Gives a point if the third character is an @ symbol
    public static int thirdat(String x){
        if(x.length() < 3){
            return 0;
        }
        Character temp = x.charAt(2);
        Character test = '@';
        if(temp.compareTo(test) == 0){
            return 1;
        }
        else{
            return 0;
        }
    }
    //Validates the password against all 5 rules, then returns how many points it recieved
    public static int validate(String x){
        rulecount = 0;
        rulecount += passwordpassword(x);
        rulecount += rule2(x);
        rulecount += onenumber(x);
        rulecount += firstcapital(x);
        rulecount += thirdat(x);
        return rulecount;


    }

}





