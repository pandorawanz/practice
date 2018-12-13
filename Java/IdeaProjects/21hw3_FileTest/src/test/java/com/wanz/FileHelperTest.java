package com.wanz;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.easymock.EasyMock.createStrictMock;

public class FileHelperTest {
    File fileIn;
    File fileOut;

    @Before
    public void Setup() {
        fileIn = createStrictMock(File.class);
        fileOut = createStrictMock(File.class);
    }

    @Test
    public void shouldCopy() throws IOException {
        FileHelper.copy(fileIn,fileOut);
    }

    // 输入和输出文件均是mock出来的时候，测试也是可以通过的！
}
