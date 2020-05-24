package cn.edu.aynu;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {

    @Test
    public void arraylist() {

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

    @Test
    public void demo(){
        //创建ArrayList对象实例
        ArrayList<String> arrayList = new ArrayList<>();
        System.out.println("######添加元素######");
        for (int i=0;i<5;i++){
            arrayList.add("str"+i);
        }
        //修改索引为0的值
        arrayList.set(0,"head");
        //使用lambda遍历集合中元素
        arrayList.forEach(str-> System.out.println(str));
        System.out.println("######插入元素######");
        arrayList.add(3,"new1");
        //可能会出现索引越界异常，添加的索引值最大为集合的长度+1
        arrayList.add(6,"new2");
        arrayList.forEach(str-> System.out.println(str));
        System.out.println("######删除元素######");
        System.out.println("删除最后插入的元素结果"+arrayList.remove("new2"));
        System.out.print("结果遍历：");
        arrayList.forEach(str-> System.out.print(str+"  "));
        //删除指定索引上的元素
        System.out.println();
        System.out.println("删除0索引"+arrayList.remove(0));
        System.out.print("结果遍历：");
        arrayList.forEach(str-> System.out.print(str+"  "));
        System.out.println();
        //过滤掉不是以s开头的元素
        System.out.print("过滤不是以s开头元素结果：");
        arrayList.stream().filter(value->value.startsWith("s")).forEach(result-> System.out.print(result+"  "));

        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(125);
        integerArrayList.add(15);
        integerArrayList.add(25);
        //对集合元素进行排序
        integerArrayList.sort((value1,value2)->value1-value2);
        System.out.println();
        System.out.print("集合元素排序结果遍历");
        integerArrayList.forEach(value-> System.out.print(value+"   "));
        System.out.println();
        //对集合中元素进行求和运算
        Integer result = integerArrayList.stream().reduce((value1, value2) -> value1 + value2).get();
        System.out.println("integerArrayList中元素求和结果为："+result);

    }
}
