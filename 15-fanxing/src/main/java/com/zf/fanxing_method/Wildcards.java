package com.zf.fanxing_method;

import com.zf.fanxing_class.Holder;

/**
 * 通配符
 * Created by feng zhang on 2017/8/20.
 */
public class Wildcards
{
    public static void rawArgs(Holder holder, Object arg)
    {
        Object obj = holder.getT();
        holder.setT(arg);
    }

    public static void unboundArg(Holder<?> holder, Object arg)
    {
        Object obj = holder.getT();
        // Error
//        holder.setT(arg);
    }

    public static <T> T exact1(Holder<T> holder)
    {
        T t = holder.getT();
        return t;
    }

    public static <T> T exact2(Holder<T> holder, T arg)
    {
        holder.setT(arg);
        T t = holder.getT();
        return t;
    }

    public static <T> T wildSubtype(Holder<? extends T> holder, T arg)
    {
        // Error
//        holder.setT(T);
        T t = holder.getT();
        return t;
    }

    public static <T> void wildSupertype(Holder<? super T> holder, T arg)
    {
        holder.setT(arg);
//        T t = (T) holder.getT();
        Object obj = holder.getT();
    }
}
