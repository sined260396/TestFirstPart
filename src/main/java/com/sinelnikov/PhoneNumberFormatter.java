package com.sinelnikov;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class PhoneNumberFormatter {

    private static final String FORMAT = "(***) ***-****";

    public static String createPhoneNumber(int[] numbers) {
        String phoneNumber = FORMAT;

        for (int i : numbers) {
            phoneNumber = phoneNumber.replaceFirst("\\*", Integer.toString(i));
        }

        return phoneNumber;
    }

    private static String createPhoneNumber(int[] numbers, String format) {
        if (numbers.length != 10) {
            throw new NumberFormatException();
        }
        StringBuilder phoneNumber = new StringBuilder(format.length());

        for(int i = 0, j = 0; i < format.length(); i++) {
            if (format.charAt(i) == '*') {
                phoneNumber.append(numbers[j]);
                j++;
            } else {
                phoneNumber.append(format.charAt(i));
            }
        }
        return phoneNumber.toString();
    }

}
