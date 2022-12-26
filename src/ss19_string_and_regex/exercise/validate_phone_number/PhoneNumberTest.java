package ss19_string_and_regex.exercise.validate_phone_number;

import java.util.Scanner;

public class PhoneNumberTest {
    public static void main(String[] args) {
        PhoneNumber phoneNumber = new PhoneNumber();
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Enter phone number (ex: (84)-(0978489648)): ");
            String numberPhone = scanner.nextLine();

            if (phoneNumber.validatePhoneNumber(numberPhone)) {
                System.out.println("Phone number valid.");
                break;
            } else {
               try {
                   throw new RegexException("Phone number not valid.");
               }catch (RegexException e){
                   e.printStackTrace();
               }
            }
        } while (true);
    }
}
