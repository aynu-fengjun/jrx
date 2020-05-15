package cn.edu.aynu;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {

    @Test
    public  void arraylist() {

        ArrayList<String> list = new ArrayList<>();
        //添加数据
        for (int i = 0; i < 10; i++) {
            list.add("张三"+i);
        }

        System.out.println("---使用普通方式遍历---");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("---使用增强for循环方式遍历---");
        for (String name : list) {
            System.out.println(name);
        }

        System.out.println("---使用迭代器方式遍历---");
        //获取迭代器
        Iterator<String> iterator = list.iterator();
        //判断是否有下一个元素
        while(iterator.hasNext()){
            //取出数据
            String next = iterator.next();
            System.out.println(next);
        }
    }
}
