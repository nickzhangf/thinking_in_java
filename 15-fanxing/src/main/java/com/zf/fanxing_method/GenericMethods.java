package com.zf.fanxing_method;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by feng zhang on 2017/8/14.
 */
public class GenericMethods
{
    public <T> void f(T t)
    {
        System.out.println(t.getClass().getName());
    }

    public static <T> List<T> makeList(T... args)
    {
        List<T> list = new ArrayList<T>();
        for (T item : args) {
            list.add(item);
        }
        return list;
    }
}
