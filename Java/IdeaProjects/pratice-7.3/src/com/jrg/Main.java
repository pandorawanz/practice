//读入一个字符串(String), 然后判断这个这个字符串是否是回文串
package com.jrg;

import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        InputStreamReader stdReader = new InputStreamReader(System.in);
        char[] str = new char[30];
        int length = stdReader.read(str);               //        System.out.println(length);
        boolean boo = true;
        for (int i = 0;i <= length/2; i++) {
            if (str[i] != str[length-i-2]) {
                boo = false;
                break;
            }
        }
        if (boo == true) {
            System.out.println("True");
        }
        else System.out.println("False");
    }
}
