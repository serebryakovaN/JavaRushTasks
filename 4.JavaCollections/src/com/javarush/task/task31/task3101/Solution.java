package com.javarush.task.task31.task3101;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;

/*
Проход по дереву файлов
*/
public class Solution {
    private static ArrayList<File> fileList = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        File path = new File(args[0]);
        File resultFileAbsolutePath = new File(args[1]);
        File allFilesContent = new File(resultFileAbsolutePath.getParent() + "/allFilesContent.txt");
        FileUtils.renameFile(resultFileAbsolutePath, allFilesContent);
        try (FileOutputStream fileOutputStream = new FileOutputStream(allFilesContent)) {

            fillFileList(path.getPath());
            fileList.sort(new FileNameComparator());

            for (File file : fileList) {
                FileInputStream fileInputStream = new FileInputStream(file);
                while (fileInputStream.available() > 0) {
                    fileOutputStream.write(fileInputStream.read());
                }
                fileOutputStream.write(System.lineSeparator().getBytes());
                fileOutputStream.flush();

                fileInputStream.close();


    }} catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Рекурсивно пробегаем поддиректории и заполняем список файлов
    private static void fillFileList(String path) {
        File[] files = new File(path).listFiles();
        for (File f : files) {
            if (f.isDirectory()) {
                fillFileList(f.getAbsolutePath());
                continue;
            }
            if (f.length() > 50)
                FileUtils.deleteFile(f);
            else
                fileList.add(f);

        }


    }

    static class  FileNameComparator implements Comparator<File> {
        public int compare(File first, File second) {
            return first.getName().compareTo(second.getName());
        }


    }
}