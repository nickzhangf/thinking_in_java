package com.zf.fanxing_method;

import java.util.List;

/**
 * Created by feng zhang on 2017/8/20.
 */
public class GenericReading
{
    public static <T> T readExact(List<T> list)
    {
        return list.get(0);
    }

    public static <T> T read(List<? extends T> list)
    {
        return list.get(0);
    }
}
