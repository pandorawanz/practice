package com.wanz;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        File fileIn = new File ("res/in.txt");
        File fileOut = new File ("res/out.txt");
        FileHelper.copy(fileIn,fileOut);
    }
}