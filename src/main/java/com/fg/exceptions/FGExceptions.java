package com.fg.exceptions;

import com.fg.utils.FileUtils;

/**
 * Created by raheela on 01/02/2019.
 */
public class FGExceptions extends RuntimeException {

    public FGExceptions(Exception e, String str) {
        FileUtils.writeExceptionToFile("File Reading Exception Trace: " + e.getStackTrace());
        if (str != null && !str.isEmpty()) {
            System.out.println(str);
        } else {
            System.out.println("Something went wrong !!");
        }

    }

    public FGExceptions(String str) {
        if (str != null && !str.isEmpty()) {
            System.out.println(str);
        } else {
            System.out.println("Something went wrong !!");
        }
    }


}
