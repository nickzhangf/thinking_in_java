package com.zf.fanxing_interface;

import java.util.Random;

/**
 * Created by feng zhang on 2017/8/14.
 */
public class CoffeeGenerator implements Generator<Coffee>
{
    private Class[] types = {Latte.class, Mocha.class};
    private static Random random = new Random(47);

    @Override
    public Coffee next()
    {
        try {
            return (Coffee) types[random.nextInt(types.length)].newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
