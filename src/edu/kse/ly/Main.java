package edu.kse.ly;

import java.io.*;

public class Main {
    public static void main(String[] args){

        File file = new File("Test.txt");
        try {
            FileOutputStream stream = new FileOutputStream(file);
            ObjectOutputStream outputStream = new ObjectOutputStream(stream);
            outputStream.writeObject(new Test());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Done.");
    }
}