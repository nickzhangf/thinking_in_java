package com.zf;

import com.zf.fanxing_class.Holder;
import com.zf.fanxing_method.Wildcards;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 测试通配符
 * Created by feng zhang on 2017/8/20.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class WildcardsTest
{
    Holder raw = new Holder();
    Holder<Long> qualified = new Holder<Long>();
    Holder<?> unbouned = new Holder<Long>();
    Holder<? extends Long> bounded = new Holder<Long>();
    Long lng = 1L;

    @Test
    public void testRawArgs()
    {
        Wildcards.rawArgs(raw, lng);
        Wildcards.rawArgs(qualified, lng);
        Wildcards.rawArgs(unbouned, lng);
        Wildcards.rawArgs(bounded, lng);

        System.out.println("zz");
    }

    @Test
    public void testUnboundedArgs()
    {
        Wildcards.unboundArg(raw, lng);
        Wildcards.unboundArg(qualified, lng);
        Wildcards.unboundArg(unbouned, lng);
        Wildcards.unboundArg(bounded, lng);

        System.out.println("zz");
    }

    @Test
    public void testExact1()
    {
        Object r1 = Wildcards.exact1(raw);
        Long r2 = Wildcards.exact1(qualified);
        Object r3 = Wildcards.exact1(unbouned);
        Long r4 = Wildcards.exact1(bounded);

        System.out.println("zz");
    }

    @Test
    public void testExact2()
    {
        Long r1 = Wildcards.exact2(raw, lng);
        // Error
//        Long r2 = Wildcards.exact2(unbouned, lng);
        Long r3 = Wildcards.exact2(qualified, lng);
        // Error
//        Long r4 = Wildcards.exact2(bounded, lng);

        System.out.println("zz");
    }

    @Test
    public void testWildSubtype()
    {
        Long r1 = Wildcards.wildSubtype(raw, lng);
        Long r2 = Wildcards.wildSubtype(qualified, lng);
        Object r3 = Wildcards.wildSubtype(unbouned, lng);
        Long r4 = Wildcards.wildSubtype(bounded, lng);
        System.out.println("zz");
    }

    @Test
    public void testWildSupertype()
    {
        Wildcards.wildSupertype(raw, lng);
//        Wildcards.wildSupertype(unbouned, lng);
//        Wildcards.wildSupertype(bounded, lng);
        Wildcards.wildSupertype(qualified, lng);
        System.out.println("zz");
    }
}
