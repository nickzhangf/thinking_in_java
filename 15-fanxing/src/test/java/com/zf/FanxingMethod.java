package com.zf;

import com.zf.fanxing_class.Person;
import com.zf.fanxing_class.Teacher;
import com.zf.fanxing_method.GenericMethods;
import com.zf.fanxing_method.GenericReading;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    @Test
    public void testMakeList()
    {
        List<String> list = GenericMethods.makeList("abc", "vvv", "gg");
        System.out.println(list);
    }

    @Test
    public void testWriteTo()
    {
        List<Person> personList = new ArrayList<>();
        GenericMethods.writeTo(personList);
        System.out.println(personList);
    }

//    @Test
//    public void testWriteTo2()
//    {
//        List<Teacher> teacherList = new ArrayList<Teacher>();
//        GenericMethods.writeTo2(teacherList);
//    }
}
