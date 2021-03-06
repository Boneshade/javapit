package com.njnx.date_se_de;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author:scott
 * @Description:用于演示序列化和反序列化的 controller
 * @Date: 2020-11-8
 */
@RestController
@RequestMapping("/need/date")
public class NeedDateController {


    @GetMapping("/param")
    public Map<String, Long> data(@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") Date date) {

        Map<String, Long> result = new HashMap<>();
        result.put("timestamp", date.getTime());

        return result;
    }

    @PostMapping("/user")
    public Map<String, String> postData(@RequestBody UserInfo userInfo) {
        Map<String, String> result = new HashMap<>();
        result.put("id", userInfo.getId().toString());
        result.put("name", userInfo.getName());
        result.put("birthday", String.valueOf(userInfo.getBirthday().getTime()));
        return result;
    }
}
