package com.zf.fanxing_class;

import lombok.Data;

/**
 * Created by feng zhang on 2017/8/14.
 */
@Data
public class Teacher extends Person
{
    private String type;

    @Override
    public void say()
    {
        System.out.println("teacher!");
    }
}
