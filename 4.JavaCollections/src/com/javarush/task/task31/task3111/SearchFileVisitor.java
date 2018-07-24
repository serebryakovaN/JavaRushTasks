package com.javarush.task.task31.task3111;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;
import java.util.SplittableRandom;

import static java.nio.file.FileVisitResult.CONTINUE;

public class SearchFileVisitor extends SimpleFileVisitor<Path> {
    private String partOfName;
    private String partOfContent;
    private int minSize;
    private int maxSize;

    private List<Path> foundFiles=new ArrayList<>();

    public List<Path> getFoundFiles() {
        return foundFiles;
    }

    public void setPartOfName(String partOfName) {
        this.partOfName = partOfName;
    }

    public void setPartOfContent(String partOfContent) {
        this.partOfContent = partOfContent;
    }

    public void setMinSize(int minSize) {
        this.minSize = minSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }



    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
      //  boolean containName=false;
        if (partOfName!=null && !file.getFileName().toString().contains(partOfName)){
            return CONTINUE;
        }
      //  boolean containContext=false;
        byte[] content = Files.readAllBytes(file); // размер файла: content.length
        String content1 = new String(content);
        if (partOfContent!=null && !content1.contains(partOfContent)){
            return CONTINUE;
        }
      //  boolean maxOk=false;
        if (maxSize>0 && attrs.size()>maxSize){
            return CONTINUE;
        }
        //boolean minOk=false;
        if (minSize>0 && attrs.size()<minSize){
            return CONTINUE;
        }

            foundFiles.add(file);


        return CONTINUE;
     //   return super.visitFile(file, attrs);
    }
}
