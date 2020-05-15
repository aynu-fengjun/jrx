package cn.edu.aynu.service;

import cn.edu.aynu.entity.Product;
import cn.edu.aynu.enums.StateEnum;
import cn.edu.aynu.exception.CustomerException;
import cn.edu.aynu.mapper.ProductMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 *@Author:冯君
 **/
@Service
@Slf4j
public class ProductServiceImpl implements ProductServiceInter{

    @Resource
    private ProductMapper productMapper;

    @Override
    public Product findProductById(String id) {
        //使用通用mapper进行查询
        Product product = productMapper.selectByPrimaryKey(id);
        if(product==null){
            //记录日志抛出异常
            log.error("【查询商品详细信息】失败！id={}",id);
            throw new CustomerException(StateEnum.PARAM_ERROR);
        }
        return product;
    }
}
