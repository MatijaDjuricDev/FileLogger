package com.it.mdevelop;

import java.io.IOException;

import com.it.mdevelop.Logger.FileLogger;

public class Main {
    public static void main(String[] args) {
        FileLogger fileLogger = new FileLogger();
        try {
            fileLogger.logToFile("Asd/asd", "");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}