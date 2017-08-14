package com.zf.fanxing_method;

/**
 * Created by feng zhang on 2017/8/14.
 */
public class GenericMethods
{
    public <T> void f(T t)
    {
        System.out.println(t.getClass().getName());
    }
}
