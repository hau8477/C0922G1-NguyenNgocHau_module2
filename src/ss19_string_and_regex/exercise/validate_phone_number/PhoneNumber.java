package ss19_string_and_regex.exercise.validate_phone_number;

import java.util.regex.Pattern;

public class PhoneNumber {
    private static final String PHONE_NUMBER = "^[(]\\d{2}[)]-+[(]0\\d{9}[)]$";

    public boolean validatePhoneNumber(String string) {
        return Pattern.matches(PHONE_NUMBER,string);
    }
}