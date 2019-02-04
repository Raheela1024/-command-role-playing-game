package com.fg.utils;

import java.util.Scanner;

/**
 * Created by raheela on 01/02/2019.
 */
public class ScannerUtils {
    public static Scanner scanner = null;

    private ScannerUtils() {
        scanner = new Scanner(System.in);
    }

    private static Scanner getScannerObject() {
        if (scanner == null) {
            scanner = new Scanner(System.in);
        }
        return scanner;
    }

    public static int getNextInt() {
        return CommonUtils.stringToInput(getScannerObject().nextLine());
    }

    public static String getNextString() {
        return getScannerObject().nextLine();
    }
}
