package cn.edu.aynu.LinkedListTest;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @Author:冯君
 **/
public class LinkedListTest {

    @Test
    public void simple() {

        //模拟排队
        LinkedList<String> list = new LinkedList<>();
        for (int i = 1; i <= 10; i++) {
            list.add("张三" + i);
        }

        CallStudent.call(list);
    }

    @Test
    public void demo() {

        LinkedList<String> linkedList = new LinkedList<>();
        System.out.println("######添加元素######");
        for (int i = 0; i < 5; i++) {
            linkedList.add("value" + i);
        }
        //向集合首尾添加元素
        linkedList.addFirst("head");
        linkedList.addLast("tail");
        //push方法向头部添加元素
        linkedList.push("head2");
        //offer方法向尾部添加元素
        linkedList.offer("tail2");
        //使用lambda遍历集合中元素
        linkedList.forEach(value -> System.out.print(value + " "));

        //修改索引为0元素信息
        linkedList.set(0,"xiugai");
        System.out.println();
        linkedList.set(1, "insert");
        System.out.println("######获取元素######");
        System.out.println("获取新插入元素"+linkedList.get(1));
        System.out.println("头部元素："+linkedList.getFirst());
        System.out.println("尾部元素："+linkedList.getLast());
        System.out.println("获取第一个元素不删除："+linkedList.peek());
        System.out.println("获取第一个元素并删除："+linkedList.poll());
        System.out.print("集合中现有元素：");
        linkedList.forEach(value-> System.out.print(value+" "));

        System.out.println();
        System.out.println("######删除元素######");
        System.out.println("删除头元素："+linkedList.remove());
        System.out.println("删除指定元素:"+linkedList.remove(linkedList.size()-1));
        System.out.println("删除头元素:"+linkedList.pop());
        System.out.print("集合中现有元素：");
        linkedList.forEach(value-> System.out.print(value+" "));

        //根据元素长度进行排序
        linkedList.sort((value1,value2)->value1.length()-value2.length());
        System.out.println();
        System.out.println("排序结果");
        linkedList.stream().forEach(value-> System.out.print(value+"    "));


    }
}
