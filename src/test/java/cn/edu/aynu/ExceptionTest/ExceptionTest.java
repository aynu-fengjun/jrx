package cn.edu.aynu.ExceptionTest;

import org.junit.Test;

public class ExceptionTest {

    @Test
    public void demo(){
        int[] array = new int[]{13,45,43,55,66,89,100};
        //会抛出索引越界异常
        try {
            array[10]=15;
            //出现异常的代码下面语句不会执行
            System.out.println(array);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("程序结束");
        }
    }
}
