package com.jrg;

public class UrlNews extends News{
    private String url;

    // 缺省构造函数，默认调用super()
    public UrlNews() {}

    // 含参构造函数
    public UrlNews(String title, String content, String url) {
        super(title,content);
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public void display() {
        System.out.println("News from Url:" + url);
        super.display();
    }

}
