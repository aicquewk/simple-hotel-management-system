package com.company;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class IOUtils {
    /** scanner for get input from System.in */
    private static Scanner sc = new Scanner(System.in);


    /**
     * read file and return for the object
     *
     * @param filepath directory of file
     * @return imported object
     */
    public static Object readObjectFromFile(String filepath)
    {
        try
        {
            FileInputStream fileIn = new FileInputStream(filepath);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            Object obj = objectIn.readObject();
            // System.out.println("Finish reading from the file: " + filepath);
            objectIn.close();
            return obj;
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
            return null;
        }
    }
}
