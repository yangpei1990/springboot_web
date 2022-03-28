package com.test.springboot.springboot_web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootWebApplicationTests {

    @Test
    public void contextLoads() {
        System.out.println("1111111111");
        int a = 1 + 3;
        assert a == 4;
        System.out.println(a);
    }

}
