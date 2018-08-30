package com.jrg;

public class News {
    protected String title;
    protected String content;

    public News(){}

    // 构造的自由和责任交给用户
    public News(String title, String content) {
        this.title = title;
        this.content = content;
    }

    /*
    public void setTitle(String title) {
        this.title = title;
    }
   */

    public String getTitle() {
        return title;
    }


    public String getContent() {
        return content;
    }

    // 控制如何显示
    public String display() {
        return title + "\n" + content;
    }

}