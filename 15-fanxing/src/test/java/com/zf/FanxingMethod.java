package com.zf;

import com.zf.fanxing_method.GenericMethods;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by feng zhang on 2017/8/14.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class FanxingMethod
{
    @Test
    public void testMethod()
    {
        GenericMethods genericMethods = new GenericMethods();
        genericMethods.f(123);
        genericMethods.f("hello");
        genericMethods.f(11.0);
    }
}
