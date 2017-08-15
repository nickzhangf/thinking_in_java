package com.zf.fanxing_class;

import lombok.Data;

/**
 * Created by feng zhang on 2017/8/15.
 */
@Data
public class Manipulator<T extends Person>
{
    private T t;

    public Manipulator(T t)
    {
        this.t = t;
    }

    public void manipulate()
    {
        t.say();
    }
}
