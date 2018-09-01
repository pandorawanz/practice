package com.jrg;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileNews extends News{
    public FileNews(String title, String content){
        super(title, content);
    }

    public FileNews() {
        super();
    }

    public void read(String url) throws IOException {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File(url)));
            title = reader.readLine(); // 读取title
            reader.readLine(); // 跳过空行
            content = reader.readLine(); //读取content
        } catch (IOException e) {
            System.out.println("新闻读取出错");
        }
    }

    @Override
    public void display() {
        System.out.println("super.display()");
    }


}
