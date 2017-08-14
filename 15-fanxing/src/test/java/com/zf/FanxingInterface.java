package com.zf;

import com.zf.fanxing_interface.CoffeeGenerator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by feng zhang on 2017/8/14.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class FanxingInterface
{
    @Test
    public void testInterface()
    {
        CoffeeGenerator generator = new CoffeeGenerator();
        System.out.println(generator.next());
        System.out.println(generator.next());
        System.out.println(generator.next());
    }
}
