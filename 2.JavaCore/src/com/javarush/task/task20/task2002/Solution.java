package com.javarush.task.task20.task2002;



import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
Читаем и пишем в файл: JavaRush
*/
public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or fix outputStream/inputStream according to your real file location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File your_file_name = File.createTempFile("your_file_name", null);
            OutputStream outputStream = new FileOutputStream(your_file_name);
            InputStream inputStream = new FileInputStream(your_file_name);

            JavaRush javaRush = new JavaRush();
            //initialize users field for the javaRush object here - инициализируйте поле users для объекта javaRush тут
            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            //check here that javaRush object equals to loadedObject object - проверьте тут, что javaRush и loadedObject равны
if(javaRush.equals(loadedObject)){
    System.out.println("ok");}
    else System.out.println("no");

            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            //implement this method - реализуйте этот метод
            PrintWriter p=new PrintWriter(outputStream);

            if(users!=null && !users.isEmpty()){
                for (int i=0;i<users.size();i++){
                p.print((users.get(i).getFirstName()!=null)? users.get(i).getFirstName():"null");
                p.print(" ");
                    p.print((users.get(i).getLastName()!=null)? users.get(i).getLastName():"null");
                    p.print(" ");
                p.print((users.get(i).getBirthDate()!=null)? users.get(i).getBirthDate().getTime():"null");
                    p.print(" ");
                    p.print(users.get(i).isMale());
                    p.print(" ");
                    p.println((users.get(i).getCountry().getDisplayedName())!=null ? users.get(i).getCountry().getDisplayedName() :"null" );
                    p.flush();
                }
                p.close();
            }

        }

        public void load(InputStream inputStream) throws Exception {
            //implement this method - реализуйте этот метод
           BufferedReader reader=new BufferedReader(new InputStreamReader(inputStream));

           int f=0;
           if (users!=null){
            while (reader.ready()){
                users.add(new User());
                String []s=reader.readLine().split(" ");
               if(!s[0].equals("null")){ users.get(f).setFirstName(s[0]); };
                if(!s[1].equals("null")){users.get(f).setLastName(s[1]);}
                if(!s[2].equals("null")){users.get(f).setBirthDate(new Date(Long.parseLong(s[2])));}
                users.get(f).setMale(new Boolean(s[3]));
                if(!s[4].equals("null")){users.get(f).setCountry(User.Country.valueOf(s[4].toUpperCase()));};
                f++;
            }}
            reader.close();


        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaRush javaRush = (JavaRush) o;

            return users != null ? users.equals(javaRush.users) : javaRush.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}
