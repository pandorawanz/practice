package com.jrg;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        News news = new News("abc","父类");
        System.out.println(news.display());

        FileNews fileNews = new FileNews("123","子类");
        System.out.println(fileNews.display());
    }
}