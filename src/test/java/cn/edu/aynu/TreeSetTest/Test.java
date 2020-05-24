package cn.edu.aynu.TreeSetTest;

import cn.edu.aynu.LinkedHashSetTest.Person;

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

    @org.junit.Test
    public void demo(){
        //创建爱你TreeSet集合对象(没有修改的特定方法)
        Set<String> set = new TreeSet();
        //添加元素
        set.add("abcftyj");
        set.add("cdfs");
        set.add("derfg");
        set.add("vbghju");
        //删除集合中指定元素
        set.remove("derfg");
        set.forEach(value-> System.out.print(value+"    "));
        //根据集合中元素的长度进行排序并遍历输出
        System.out.println();
        System.out.println("######排序######");
        set.stream().sorted((value1,value2)->value1.length()-value2.length()).forEach(value-> System.out.println(value));
    }
}
