package cn.edu.aynu.TreeSetTest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 *@Author:冯君
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book implements Comparable<Book>{

    //图书名称
    private String name;
    //价钱
    private int  price;

    /**
     *@Description: 集合中数据存储比较
     *@param:  book
     *@return int
     **/
    @Override
    public int compareTo(Book o) {
        return (int)(this.name==o.name? this.price-o.price:this.name.compareTo(o.name));
    }
}
