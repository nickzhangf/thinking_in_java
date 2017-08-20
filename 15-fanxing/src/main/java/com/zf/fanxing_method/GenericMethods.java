package com.zf.fanxing_method;

import com.zf.fanxing_class.EnTeacher;
import com.zf.fanxing_class.Person;
import com.zf.fanxing_class.Teacher;

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

    public static void writeTo(List<? super Person> persons)
    {
        persons.add(new Person());
        persons.add(new Teacher());
    }

    public static void writeTo2(List<? super Teacher> teachers)
    {
        teachers.add(new Teacher());
        teachers.add(new EnTeacher());
    }
}
