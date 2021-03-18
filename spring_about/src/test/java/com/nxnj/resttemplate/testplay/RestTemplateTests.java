package com.nxnj.resttemplate.testplay;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;
import org.springframework.web.client.RestTemplate;

/**
 * @author xubr
 * @title: RestTemplateTests
 * @projectName javapit
 * @description: <h1>编写RestTemplate发送Http请求</h1>
 * @date 2021/3/1613:45
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class RestTemplateTests {

    RestTemplate restTemplate = null;

    /**
     * 前置通知在方法执行前完成
     */
    @Before
    public void setUp() {
        restTemplate = new RestTemplate();
    }


    @Test
    public void testGet_product1() {
        String url = "http://localhost:8080/product/get_product1";
        //方式1:GET 方式获取JSON数据
        String result = restTemplate.getForObject(url, String.class);
        System.out.println("get_product1返回结果:" + result);
        Assert.hasText(result, "get_product1返回结果为空");

    }


}
