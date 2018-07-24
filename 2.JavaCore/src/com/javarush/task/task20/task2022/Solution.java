package com.javarush.task.task20.task2022;

import java.io.*;

/* 
Переопределение сериализации в потоке
*/
public class Solution implements Serializable, AutoCloseable {
    transient private FileOutputStream stream;
    private String fileName;

    public Solution(String fileName) throws FileNotFoundException {
        this.stream = new FileOutputStream(fileName);
        this.fileName=fileName;
    }
    public Solution(){}


    public void writeObject(String string) throws IOException {
        stream.write(string.getBytes());
        stream.write("\n".getBytes());
        stream.flush();
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();

    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        this.stream=new FileOutputStream(fileName, true);

    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing everything!");
        stream.close();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
     Solution s=new Solution("D:/ETZ.txt");
     s.writeObject("Мама");
     ObjectOutputStream out=new ObjectOutputStream(s.stream);
     s.writeObject(out);

        ObjectInputStream ois = new ObjectInputStream((new FileInputStream("D:/ETZ1.txt")));
        Solution solution2 = new Solution();
        solution2.readObject(ois);
    solution2.writeObject("jhhjk");




    }
}
