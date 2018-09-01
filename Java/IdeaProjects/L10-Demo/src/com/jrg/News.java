package com.jrg;

public class News implements Displayable{
    protected String title;
    protected String content;

    public News(){}

    // 构造的自由和责任交给用户
    public News(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    //注解表示方法来自上一层，可以检查方法名和方法类型是否写错了
    @Override
    // 控制如何显示
    public void display() {
        System.out.println(title + "\n" + content);
    }
}