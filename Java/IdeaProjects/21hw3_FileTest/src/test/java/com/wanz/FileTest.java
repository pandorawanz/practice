package com.wanz;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.easymock.EasyMock.createStrictMock;

public class FileTest {
    String pathIn = "res/in.txt";
    File fileIn;
    File fileOut;

    @Before
    public void setup() throws IOException{
        fileIn = new File(pathIn);
        fileOut = createStrictMock(File.class);
    }

    @Test
    public void shouldReadToString() throws IOException {
        fileIn.readToString();
        System.out.println(fileIn.getContent());
    }

    @Test
    public void shouldWriteString() throws IOException {
        String content = "Write,please.\nThank you!";
        fileOut.setContent(content);
        System.out.println(fileOut.getContent());
    }

    //String是final类，因此无法被mock
    //测试中的语句是会被实际执行的，因此指明了文件输出路径时，会被确实写入。
    // mock的对象中的成员默认都是null值,且貌似无法直接改变其成员。
}
