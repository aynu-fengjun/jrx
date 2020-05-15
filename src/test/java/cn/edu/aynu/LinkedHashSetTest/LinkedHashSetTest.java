package cn.edu.aynu.LinkedHashSetTest;

import org.junit.Test;

import java.util.*;

/**
 *@Author:冯君
 **/
public class LinkedHashSetTest {

    public static void main(String[] args) {

        Set<Character> set = new LinkedHashSet<>();
        //键盘录入信息，去除重复字符，并按顺序打印
        Scanner sc=new Scanner(System.in);
        //字符串转化字符数组
        char[] chars = sc.next().toCharArray();
        for (int i = 0; i < chars.length; i++) {
            set.add(chars[i]);
        }
        //遍历
        for (Character character : set) {
            System.out.print(character);
        }
    }

    @Test
    public void simple2() {
        Set<Person> linkedHashSet = new LinkedHashSet<>();
        //添加数据
        linkedHashSet.add(new Person("张三",40));
        linkedHashSet.add(new Person("李四",12));
        linkedHashSet.add(new Person("王武",20));
        linkedHashSet.add(new Person("王武",20));
        //遍历集合中数据
        for (Person person : linkedHashSet) {
            System.out.println(person);
        }
    }
}
