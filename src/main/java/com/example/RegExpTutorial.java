package com.example;

import java.util.regex.Pattern;

public class RegExpTutorial {
    
    public boolean validatePhoneNumber(String phoneNumber) {
        // implement with regular expression	
        return Pattern.matches("[\\(]*\\d{3}[\\)\\.\\-]*\\d{3}[\\.\\-]*\\d{4}", phoneNumber);
    }

    public boolean validateEmail(String email) {
        // implement with regular expression	
        return Pattern.matches("[\\-\\.\\_\\w]+@[\\-\\.\\_\\w]+\\.[\\-\\.\\_\\w]+", email);
    }
}