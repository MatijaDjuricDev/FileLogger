package com.it.mdevelop.Logger;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileLogger {

    enum MODE {
        APPEND,
        REWRITE
    }

    File checkFile(String path) throws IOException {
        Path p = Paths.get(path);

        File folders = new File(p.getParent().toString());
        File file = new File(path);

        if (!folders.exists()) {
            folders.mkdirs();
        }

        if (!file.exists()) {
            file.createNewFile();
        }

        return file;
    }

    public File logToFile(String path, String content) throws IOException {

        File file = checkFile(path);

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            bufferedWriter.write(content);
        }

        return file;
    }

    public File appendToFile(String path, String content) throws IOException {

        File file = checkFile(path);

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true))) {
            bufferedWriter.write(content);
        }

        return file;
    }
}
