package com.zf.fanxing_interface;

import lombok.Data;

/**
 * Created by feng zhang on 2017/8/14.
 */
@Data
public class Coffee
{
    private static long counter = 0;
    private final long id = counter++;

    @Override
    public String toString()
    {
        return getClass().getSimpleName() + " " + id;
    }
}
