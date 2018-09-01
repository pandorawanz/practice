package com.jrg;


import java.io.IOException;


public class Main {

    public static void main(String[] args) throws IOException {
        News news = new News("abc","父类");
        News urlnews = new UrlNews("ABC","子类", "class.com");
        news.display();
        urlnews.display();
        viewNews(news);
        viewNews(urlnews);


        Video video = new Video();
        viewNews(news); //news 实现了Displayable
        viewNews(video);
        Displayable displayable = new Video();
        displayable.display();

        News news2 = read(new UrlNewsReader(), "path_sample");
        News news3 = read(new FileNewsReader(),"path_sample2");
        NewsReader newsReader = new UrlNewsReader();
        newsReader.readNews("path_sample");
    }

    private static News read(NewsReader reader, String path) {
        return reader.readNews(path);
    }

    private static void viewNews(Displayable item) {
        item.display();
        System.out.println("播放完毕");
    }
}