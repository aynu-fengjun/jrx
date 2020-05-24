package cn.edu.aynu.HashMapTest;

import cn.edu.aynu.LinkedHashSetTest.Person;
import org.junit.Test;

import java.util.*;

public class HashMapTest {

    @Test
    public void demo(){

        //创建hashMap的实例对象（没有特定的修改方法，不能获取stream对象）
        HashMap<Person,String> map = new HashMap();
        Person p1 = new Person("赵六",23);
        Person p2 = new Person("王二麻",19);
        Person p3 = new Person("李四", 22);
        //添加元素
        map.put(p1,"河南安阳");
        map.put(p2,"河南济源");
        map.put(p3,"河南郑州");
        //根据key获得存储的值
        System.out.println("获取person3对象的籍贯："+map.get(p3));
        //map的遍历方式1：获取所有的键值映射的集合
        System.out.println("######根据Map的键值映射对象遍历集合######");
        Set<Map.Entry<Person,String>> entrySet = map.entrySet();
        for (Map.Entry<Person, String> entry : entrySet) {
            System.out.println(entry.getKey()+"籍贯："+entry.getValue());
        }
        //map的遍历方式2：获取所有的entry对象
        System.out.println("######根据Map的键遍历集合######");
        Set<Person> peopleSet = map.keySet();
        for (Person person : peopleSet) {
            System.out.println(person+"籍贯："+map.get(person));
        }

        //获取所有的value值
        System.out.println("######遍历获取集合中所有的值######");
        Collection<String> values = map.values();
        for (String value : values) {
            System.out.print(value+"  ");

        }
        System.out.println();
        //删除map中指定元素
        String result = map.remove(p1);
        System.out.println("删除person1对象的地址为："+result);

        System.out.println("######使用lambda表达式遍历集合元素######");
        map.forEach((key,value)-> System.out.println(key+"籍贯:"+value));

    }
}
