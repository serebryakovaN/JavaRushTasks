package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* 
Знакомство с properties
*/
public class Solution {
    public static Map<String, String> properties = new HashMap<>();
    Properties prop = new Properties();

    public void fillInPropertiesMap() throws Exception {
        //implement this method - реализуйте этот метод

        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String file=reader.readLine();
        reader.close();
        InputStream input = new FileInputStream(file);

        load(input);

    }

    public void save(OutputStream outputStream) throws Exception {
        //implement this method - реализуйте этот метод
        PrintWriter printWriter = new PrintWriter(outputStream);
        prop.putAll(properties);
        prop.store(printWriter, null);
        printWriter.close();

        }


    public void load(InputStream inputStream) throws Exception {
        //implement this method - реализуйте этот метод
        prop.load(inputStream);
        for (Map.Entry<Object, Object> pair : prop.entrySet()){
            properties.put((String) pair.getKey(), (String) pair.getValue());
        }

}


    public static void main(String[] args) throws Exception {
new Solution().fillInPropertiesMap();
    }
}
