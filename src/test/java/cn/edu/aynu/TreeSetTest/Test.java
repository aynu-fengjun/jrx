package cn.edu.aynu.TreeSetTest;

import java.util.*;

/**
 * Author: admin
 * Create Data: 2019/8/10
 */
public class Test {

    public static void main(String[] args) {

        //模拟上架图书信息
        Set<Book> set = new TreeSet();
        set.add(new Book("java基础",20));
        set.add(new Book("javaWeb",60));
        set.add(new Book("SSM",89));
        set.add(new Book("Guava",89));
        set.add(new Book("SSH",89));
        set.add(new Book("SSH",89));

        //遍历上架图书信息
       set.forEach((param)->System.out.println("名称："+param.getName()+" 价钱："+param.getPrice()));
    }
}
