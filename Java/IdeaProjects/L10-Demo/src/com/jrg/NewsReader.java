package com.jrg;

public abstract class NewsReader {

    private Integer x;

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    // 具有这个功能，但具体的功能实现，在子类中确定
    public News readNews(String path) {
        System.out.println("来自父类");
        //模拟读取
        return null;
    }

    // 1. 文件  -> 类
    // 纯文本 wprd, json, xml
    // 2. 网络 Url  -> 类
    // 3. 标准输入  -> 类
    // 4. 语音识别  -> 类

    //不同的Reader
}
