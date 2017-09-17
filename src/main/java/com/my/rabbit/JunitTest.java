package com.my.rabbit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
public class JunitTest {

    @Test
    public void test(){
        com.my.rabbit.Test junitTest=new com.my.rabbit.Test();
        junitTest.init();
    }
}
