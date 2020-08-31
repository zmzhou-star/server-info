package com.zmzhou.server;

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
        Server server = new Server();
        server.copyTo();
        System.out.println("服务器信息："+ JSON.toJSONString(server));
        Assert.assertNotNull(server);
    }
}
