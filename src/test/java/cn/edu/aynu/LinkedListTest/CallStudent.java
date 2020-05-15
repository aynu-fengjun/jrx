package cn.edu.aynu.LinkedListTest;

import java.util.List;

/**
 *@Author:冯君
 **/
public class CallStudent {

    public static void call(List<String> list){
        int count=list.size();
        for (int i = 0; i < count; i++) {
            //删除正在打饭的人
            String name = list.remove(0);
            System.out.println("正在打饭的人是："+name);
            if(count-i-1==0){
                return;
            }
            System.out.println("后面还有"+(count-i-1)+"人在排队");
        }
    }
}
