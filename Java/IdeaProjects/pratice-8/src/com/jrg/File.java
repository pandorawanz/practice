/*
创建一个File类用于表示文件. 然后这个类能够满足以下几个功能:
        1.拥有一个构造方法, 接收一个字符串, 表示硬盘中文件的路径. 表示创建的File对象对应的硬盘中的文件;
        2.拥有一个readToString(); 方法, 功能是读取文件内容, 然后返回一个String;
        3.拥有一个writeString(String content); 方法, 功能是写入一个字符串到文件中;
*/
package com.jrg;

import java.io.*;

public class File{
    private String path;
    public File(String path) {
        this.path = path;
    }
    public String readToString() throws IOException {
        FileInputStream input = new FileInputStream(path);
        InputStreamReader reader = new InputStreamReader(input,"UTF-8");
        BufferedReader bufferedReader = new BufferedReader(reader);
        String context = "";
        String line = null;
        while ((line = bufferedReader.readLine()) != null) {
            context += line + "\n";
        }
        bufferedReader.close();
        reader.close();
        input.close();
        return context;
    }
    public void writeString(String content) throws IOException{
        FileOutputStream output = new FileOutputStream(path);
        OutputStreamWriter writer = new OutputStreamWriter(output,"UTF-8");
        PrintWriter printer = new PrintWriter(writer);
        printer.print(content);
        printer.close();
        writer.close();
        output.close();
    }
}
