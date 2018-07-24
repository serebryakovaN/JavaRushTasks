package com.javarush.task.task21.task2101;

/* 
Определяем адрес сети
*/
public class Solution {
    public static void main(String[] args) {
        byte[] ip = new byte[]{(byte) 192, (byte) 168, 1, 2};
        byte[] mask = new byte[]{(byte) 255, (byte) 255, (byte) 254, 0};
        byte[] netAddress = getNetAddress(ip, mask);
        print(ip);          //11000000 10101000 00000001 00000010
        print(mask);        //11111111 11111111 11111110 00000000
        print(netAddress);  //11000000 10101000 00000000 00000000
    }

    public static byte[] getNetAddress(byte[] ip, byte[] mask) {
        byte[]m=new byte[4];
        m[0]=(byte)(ip[0]& mask[0]);
        m[1]=(byte)(ip[1]& mask[1]);
        m[2]=(byte)(ip[2]& mask[2]);
        m[3]=(byte)(ip[3]& mask[3]);

        return m;

    }

    public static void print(byte[] bytes) {
        for (byte b : bytes) {
            //Byte to binary format
            System.out.print(Integer.toBinaryString((b & 0xFF) + 0x100).substring(1)+" ");
        }
        }
    }

