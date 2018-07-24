package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

/**
 * Created by hp on 29.09.2017.
 */
public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes t){
       if (t==ImageTypes.BMP){
           return new BmpReader();
       }
         else {
           if (t == ImageTypes.JPG) {
               return new JpgReader();
           } else {
               if (t == ImageTypes.PNG) {
                   return new PngReader();
               }
               else throw new IllegalArgumentException ();
           }
       }


    }
}
