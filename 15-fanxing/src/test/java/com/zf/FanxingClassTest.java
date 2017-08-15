package com.zf;

import com.zf.fanxing_class.Holder;
import com.zf.fanxing_class.Manipulator;
import com.zf.fanxing_class.Person;
import com.zf.fanxing_class.Teacher;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by feng zhang on 2017/8/14.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class FanxingClassTest
{
    @Test
    public void testHolder()
    {
        Holder<Person> holder = new Holder<>();
        Person person = new Person();
        person.setName("nick");
        person.setAge(31);
        holder.setT(person);
        System.out.println(holder);
    }

    @Test
    public void testHolder1()
    {
        Holder<Person> holder = new Holder<>();
        Teacher teacher = new Teacher();
        teacher.setName("zf");
        teacher.setAge(43);
        teacher.setType("teacher");
        holder.setT(teacher);
        System.out.println(holder);
    }

    @Test
    public void testManipulator()
    {
        Teacher teacher = new Teacher();
        teacher.setName("nick");
        Manipulator<Teacher> manipulator = new Manipulator<>(teacher);
        manipulator.manipulate();
    }
}
