package com.bl.Junittest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Userregistration {

    public boolean getfirstrname(String firstname) {
        String firstnameRegex = "^[A-Z]{1}[a-z]{3,}$";
        Pattern pattern = Pattern.compile(firstnameRegex);
        Matcher matcher = pattern.matcher(firstname);
        boolean result = matcher.matches();
        return result;
    }

public boolean getLastName(String lastname) {
    String Lastnameregex = "^[A-Z]{1}[a-z]{3}$";
    Pattern pattern = Pattern.compile(Lastnameregex);
    Matcher matcher = pattern.matcher(lastname);
    boolean result = matcher.matches();
    return result;
}

public boolean getEmailid(String emailid){
    String EmailidRegex = "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+([.][a-zA-Z]{2,4})([.][a-zA-Z]{2})*$";
    Pattern pattern = Pattern.compile(EmailidRegex);
    Matcher matcher = pattern.matcher(emailid);
    boolean result = matcher.matches();
    return result;
    }
    public boolean getphonenumber(String phonenumber){
        String PhonenumberRegex = "^[1-9]{2}\\\\s[0-9]{0,10}$";
        Pattern pattern = Pattern.compile(PhonenumberRegex);
        Matcher matcher = pattern.matcher(phonenumber);
        boolean result = matcher.matches();
        return result;
    }
    public boolean getpaswordrule1(String passwordrule1) {
        String Passwordrule1Regex = "^[A-Za-z]{8,}$";
        Pattern pattern = Pattern.compile(Passwordrule1Regex);
        Matcher matcher = pattern.matcher(passwordrule1);
        boolean result = matcher.matches();
        return result;
    }
    public boolean getpasswordrule2(String passwordrule2){
        String Passwordrule2Regex = "^(?=.*[A-Z])[a-z].{8,}$";
        Pattern pattern = Pattern.compile(Passwordrule2Regex);
        Matcher matcher = pattern.matcher(passwordrule2);
        boolean result = matcher.matches();
        return result;
    }
    public boolean getpasswordrule3(String passwordrule3){
          String Passwordrule3Regex = "^(?=.*[0-9])(?=.*[A-Z])(?=.*[a-z]).{8,}$;";
          Pattern pattern = Pattern.compile(Passwordrule3Regex);
          Matcher matcher = pattern.matcher(passwordrule3);
          boolean result = matcher.matches();
          return result;
    }
    public boolean getpasswordrule4(String passwordrule4){
        String Passwordrule4regex = "^(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=.*[a-z]).{8,}$";
        Pattern pattern = Pattern.compile(Passwordrule4regex);
        Matcher matcher = pattern.matcher(passwordrule4);
        boolean result = matcher.matches();
        return result;

    }
}


