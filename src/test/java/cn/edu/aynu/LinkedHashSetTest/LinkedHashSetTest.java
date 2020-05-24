package cn.edu.aynu.LinkedHashSetTest;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

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

    @Test
    public void demo(){
        //创建LinkedHashSet实例（没有修改的指定方法）
        LinkedHashSet<Person> linkedHashSet = new LinkedHashSet<>();
        Person p1 = new Person("张三",40);
        Person p2 = new Person("李四",12);
        Person p3 = new Person("王武", 20);
        //添加元素
        linkedHashSet.add(p1);
        linkedHashSet.add(p2);
        linkedHashSet.add(p3);
        //删除元素
        linkedHashSet.remove(p2);
        //遍历元素
        linkedHashSet.forEach(person-> System.out.println(person));
        //清空集合列表
        linkedHashSet.clear();

        LinkedHashSet<String> hashSet = new LinkedHashSet<>();
        hashSet.add("value1");
        hashSet.add("value2");
        hashSet.add("str1");
        hashSet.add("zx");
        System.out.println("集合中长度大于等于3的元素：");
        //使用jdk8的新特性过滤元素
        hashSet.stream().filter(value->value.length()>=3).forEach(value-> System.out.print(value+"  "));
    }
}
