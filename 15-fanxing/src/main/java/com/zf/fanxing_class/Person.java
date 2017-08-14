package com.zf.fanxing_class;

import lombok.Data;

/**
 * Created by feng zhang on 2017/8/14.
 */
@Data
public class Person
{
    private String name;
    private Integer age;

    public void say()
    {
        System.out.println("Person!");
    }
}
