package com.sinelnikov;

public class Application {
    public static void main(String args[]) {
        String phoneNumber = PhoneNumberFormatter.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0});
        System.out.println(phoneNumber);
    }
}
