package com.example.springboothomework.testandlombok;

import jdk.jfr.FlightRecorder;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

@Slf4j
@SpringBootTest
public class TestFileUtil {
    @Autowired
    private FileUtil fileUtil;

    @Test
    public void test_getFileSize1() {
        Path file = Paths.get("C:\\Users\\Mr.wang\\Desktop\\testfile.txt");
        long size= fileUtil.getSize(file);
        long hope= 11;
      Assertions.assertEquals(hope,size);
    }
    @Test
    public void test_getFileSize2() {
        Path file = Paths.get("C:\\Users\\Mr.wang\\Desktop\\testfile2.txt");
        long size= fileUtil.getSize(file);
        long hope= 12;
        Assertions.assertEquals(hope,size);
    }
    @Test
    public void test_getFileSize3() {
        Path file = Paths.get("C:\\Users\\Mr.wang\\Desktop\\testfile3.txt");
        long size= fileUtil.getSize(file);
        long hope= 13;
        Assertions.assertEquals(hope,size);
    }

}

