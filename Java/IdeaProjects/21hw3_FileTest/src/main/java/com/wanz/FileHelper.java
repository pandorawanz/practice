/*
创建一个FileHelper类,其中只有一个静态方法 copy, 其功能为:
        1.接受两个参数, 参数类型都为File: file1, file2.
        2.意思为把file1的内容写入到file2中.
*/
package com.wanz;

import java.io.IOException;

public class FileHelper {
    public static void copy(File fileIn, File fileOut) throws IOException {
        fileIn.readToString();
        String content = fileIn.getContent();
        fileOut.setContent(content);
        fileOut.writeString();
    }
}
