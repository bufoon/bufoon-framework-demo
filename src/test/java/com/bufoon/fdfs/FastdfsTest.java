package com.bufoon.fdfs;

import com.bufoon.AbstractTest;
import com.bufoon.storage.fdfs.IFastdfsService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Author: bufoon
 * @Email: 285395841@qq.com
 * @Datetime: Created In 2018/5/6 17:04
 * @Desc: as follows.
 */
public class FastdfsTest extends AbstractTest {

    @Autowired
    private IFastdfsService fastdfsService;

    @Test
    public void test() throws IOException {
        File file = new File("D:\\diagram.png");
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bytes = new byte[20480];
        fileInputStream.read(bytes);
        System.out.println(fastdfsService.uploadFile(bytes, "png"));
        System.out.println(fastdfsService.download("group1/M00/00/00/wKgfgFrvID2ALDSXAABQAMVzRmM443.png").length);;
    }
}
