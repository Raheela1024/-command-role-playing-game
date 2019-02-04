package com.fg.utils;

import com.fg.game.services.entities.Game;

import java.io.*;
import java.nio.file.Paths;

/**
 * Created by raheela on 01/02/2019.
 */
public class FileUtils {

    private static String filePath = "src/main/resources/";
    private static String fileName = "game.text";
    private static String exceptionFileName = "exceptions.text";

    public static void stringToFile(Object content) {
        writeObjectTOFile(content, fileName);
    }

    public static Game fileToObject() {

        try {
            FileInputStream fi = new FileInputStream(createFileIfDoesNotExist(absolutePath(filePath, fileName)));
            ObjectInputStream oi = new ObjectInputStream(fi);
            return (Game) oi.readObject();
        } catch (Exception e) {
            writeExceptionToFile("File Reading Exception Trace: " + e.getMessage());
            System.out.println("You haven't play any GameService Yet !!!");
        }
        return null;
    }

    private static File createFileIfDoesNotExist(String absolutePath) throws IOException {
        File file = new File(absolutePath);
        if (file.exists()) {
            return file;
        }
        file.getParentFile().mkdirs();
        file.createNewFile();
        return file;
    }

    private static String absolutePath(String basePath, String pathToFile) {
        return Paths.get(basePath, pathToFile).toAbsolutePath().toString();
    }

    public static void writeExceptionToFile(Object content) {
        writeObjectTOFile(content, exceptionFileName);
    }

    private static void writeObjectTOFile(Object content, String fileName) {
        try {
            FileOutputStream fileOut = new FileOutputStream(absolutePath(filePath, fileName));
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(content);
        } catch (Exception e) {
            System.out.println("Exception While writing file : " + e.getMessage());
        }
    }
}
