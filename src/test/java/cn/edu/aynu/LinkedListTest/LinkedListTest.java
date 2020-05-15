package cn.edu.aynu.LinkedListTest;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
/**
 *@Author:冯君
 **/
public class LinkedListTest {

    @Test
    public void simple() {

        //模拟排队
        LinkedList<String> list = new LinkedList<>();
        for (int i = 1; i <= 10; i++) {
            list.add("张三"+i);
        }

        CallStudent.call(list);
    }
}
