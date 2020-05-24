package cn.edu.aynu.PriorityQueueTest;

import java.util.PriorityQueue;

public class Test {
    public static void main(String[] args) {
        PriorityQueue<Character> queue1 = new PriorityQueue<>();
        //添加元素
        queue1.offer('k');
        queue1.offer('f');
        queue1.offer('d');
        //打印结果为[d, k, f]
        System.out.println(queue1);
        //打印结果为d 获取头部元素不删除
        System.out.println(queue1.peek());
        //打印结果为d，获取头部元素删除
        System.out.println(queue1.poll());
        //打印结果为f
        System.out.println(queue1.peek());

        PriorityQueue<Object> queue2 = new PriorityQueue<>();
       /* //获取空列表不删除数据   出现NoSuchElementException运行时异常
        Object element = queue2.element();
        System.out.println(element);*/
        //不会出现异常打印出null值
        Object peek = queue2.peek();
        System.out.println(peek);
    }
}
