package org.seckill.dao;

import org.junit.Test;
import org.junit.internal.runners.JUnit4ClassRunner;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.seckill.util.MD5Code;
import org.slf4j.LoggerFactory;

import java.util.Date;

/**
 * @author stary
 * @date 2018/7/25 下午4:01
 */
@RunWith(JUnit4.class)
public class test {

    private final org.slf4j.Logger logger = LoggerFactory.getLogger(this.getClass());

    @Test
    public void md5(){
        String md5 = new MD5Code().getMD5ofStr("qqq");
        String md4 = new MD5Code().getMD5ofStr("qqq");
        System.out.println(md4);
        System.out.println(md5);
        System.out.println(md4.equals(md5));
    }

    @Test
    public void test(){
        Date now = new Date();
        logger.info("now={}",now);
    }
}
