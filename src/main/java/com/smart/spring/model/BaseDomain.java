package com.smart.spring.model;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * @Author: Stupid Boy
 * @Date: 2018/11/30 10:30
 * @Version 1.0
 * @Description:基础PO类
 */

public class BaseDomain implements Serializable {
    //定义统一的toString()方法
    public String toString() {

        return ToStringBuilder.reflectionToString(this);
    }
}
