package com.desgin.pattern.creational.abstractfactory;

/**
 * Create by eval on 2019/1/24
 */
public class JavaArticle extends Article {
    @Override
    public void produce() {
        System.out.println("编写Java课程手记");
    }
}
