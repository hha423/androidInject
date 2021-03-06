package com.wangjie.androidinject.annotation.annotations.base;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created with IntelliJ IDEA.
 * Author: wangjie  email: tiantian.china.2@gmail.com
 * Date: 13-11-29
 * Time: 下午2:04
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface AIView {
    int value() default -1; // 控件resId
    int id() default -1; // 控件resId
    String clickMethod() default ""; // 点击回调方法（方法参数必须只有一个View！）
    String longClickMethod() default ""; // 长按回调方法（方法参数必须只有一个View！）
    String itemClickMethod() default ""; // AdapterView的item点击回调
    String itemLongClickMethod() default ""; // AdapterView的item长按

}
