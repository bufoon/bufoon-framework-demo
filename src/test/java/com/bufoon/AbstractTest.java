package com.bufoon;

import com.bufoon.demo.DemoApp;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author: bufoon
 * @Email: 285395841@qq.com
 * @Datetime: Created In 2018/5/6 0:35
 * @Desc: as follows.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=DemoApp.class)
public class AbstractTest {
    protected Logger logger = LoggerFactory.getLogger(getClass());

}
