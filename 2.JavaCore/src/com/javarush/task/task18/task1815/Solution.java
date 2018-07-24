package com.javarush.task.task18.task1815;

import java.util.List;

/* 
Таблица
*/

public class Solution {
    public class TableInterfaceWrapper implements ATableInterface{
ATableInterface t;

public TableInterfaceWrapper(ATableInterface t){
    this.t=t;
}
        @Override
        public void setModel(List rows) {
            System.out.println(rows.size());
            t.setModel(rows);
        }

        @Override
        public String getHeaderText() {
            return t.getHeaderText().toUpperCase();
        }

        @Override
        public void setHeaderText(String newHeaderText) {
t.setHeaderText(newHeaderText);
        }
    }

    public interface ATableInterface {
        void setModel(List rows);

        String getHeaderText();

        void setHeaderText(String newHeaderText);
    }

    public static void main(String[] args) {
    }
}