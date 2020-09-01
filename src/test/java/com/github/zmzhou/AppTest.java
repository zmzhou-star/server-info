package com.github.zmzhou;

import org.junit.Assert;
import org.junit.Test;

import com.alibaba.fastjson.JSON;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * @description  打印服务器信息
     * Rigorous Test :-)
     * @author zmzhou
     * @date 2020/8/31 22:02
     */
    @Test
    public void shouldAnswerWithTrue() {
        ServerInfo serverInfo = new ServerInfo();
        System.out.println("服务器信息："+ JSON.toJSONString(serverInfo));
        Assert.assertNotNull(serverInfo);
    }
}
