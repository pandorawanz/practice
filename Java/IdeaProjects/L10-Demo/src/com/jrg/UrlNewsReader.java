package com.jrg;

public class UrlNewsReader extends NewsReader{


    public News readNews(String path){
        super.readNews(path);
        System.out.println("Url reading......");
        return null;
    }
}
