//读入一个字符串(String), 然后反转这个字符串, 然后输出.
package com.jrg;

import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Input the String below:");
        InputStreamReader stdReader = new InputStreamReader(System.in);
        char[] buffer = new char[30];
        int length = stdReader.read(buffer);
        System.out.println("After reverse:");
        for(int i = length-2; i >= 0; i--){
            System.out.print(buffer[i]);
        }
    }
}