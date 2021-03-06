package com.njnx.endpoint;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author:scott
 * @Description
 * @Date: 2020-11-22
 */
@Endpoint(id = "datetime")
public class DateTimeEndPoint {

    private String format = "yyyy-mm-dd HH:mm:ss";


    @ReadOperation
    public Map<String, Object> info() {

        Map<String, Object> info = new HashMap<>();
        info.put("name", "qinyi");
        info.put("age", "19");
        info.put("datetime", new SimpleDateFormat(format).format(new Date()));
        return info;
    }

    /**
     * 动态更改监控指标
     */
    @WriteOperation
    public void setFormat(String format) {
        this.format = format;
    }


}
