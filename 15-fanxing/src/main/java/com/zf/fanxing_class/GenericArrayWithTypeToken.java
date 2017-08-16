package com.zf.fanxing_class;

import java.lang.reflect.Array;
import java.util.stream.Stream;

/**
 * Created by feng zhang on 2017/8/16.
 * 创建泛型数组的正确姿势
 */
public class GenericArrayWithTypeToken<T>
{
    private T[] array;

    // 为应对类型擦除，引入类型标签进行补偿
    public GenericArrayWithTypeToken(Class<T> type, int sz)
    {
        array = (T[]) Array.newInstance(type, sz);
    }

    public void put(int index, T item)
    {
        array[index] = item;
    }

    public T get(int index)
    {
        return array[index];
    }

    public T[] rep()
    {
        return array;
    }

    public static void main(String[] args)
    {
        GenericArrayWithTypeToken<Integer> gai =
                new GenericArrayWithTypeToken<>(Integer.class, 5);
        gai.put(0, 1);
        gai.put(1, 1);
        gai.put(2, 1);
        Integer[] ia = gai.rep();
        Stream.of(ia).forEach(t -> System.out.println(t));
    }
}

