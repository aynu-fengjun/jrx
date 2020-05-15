package cn.edu.aynu.service;

import cn.edu.aynu.entity.Product;

public interface ProductServiceInter {

    //根据商品id查询商品信息详情
    Product findProductById(String id);
}
