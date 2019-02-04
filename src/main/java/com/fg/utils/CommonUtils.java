package com.fg.utils;

import com.fg.exceptions.FGExceptions;

/**
 * Created by raheela on 01/02/2019.
 */
public class CommonUtils {

    public static int getRandomNumber(int number) {
        return (int) Math.ceil(Math.random() * number);
    }

    public static void printMessage(String str) {
        System.out.println(str);
    }

    public static int stringToInput(String str) {
        try {
            checkString(str);
            return Integer.parseInt(str);
        } catch (Exception e) {
            FileUtils.writeExceptionToFile(e.getStackTrace());
            System.out.println("Please Provide a valid Input to Proceed!!");
        }
        return ScannerUtils.getNextInt();
    }

    public static void checkString(String str) {
        if (str == null || str.isEmpty()) {
            throw new FGExceptions(String.format("Empty string {}", str));
        }
    }
}
