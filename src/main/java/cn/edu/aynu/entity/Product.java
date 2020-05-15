package cn.edu.aynu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Id;
import java.util.Date;

/**
 *@Author:冯君
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    //商品id
    @Id
    private Integer id;

    //商品名称
    private String productName;

    //价钱
    private java.math.BigDecimal price;

    //上架日期
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date pubDate;

    //图片
    private String picture;

    //评价星级
    private Integer star;

    //商品描述
    private String info;


}
