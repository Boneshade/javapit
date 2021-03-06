package com.njnx.clone;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author:scott
 * @Description
 * @Date: 2020-10-24
 */
@Data
@AllArgsConstructor
public class EducationInfo implements Serializable {

    private String school;

    private String time;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


}
