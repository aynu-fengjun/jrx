package cn.edu.aynu.controller;

import cn.edu.aynu.entity.Product;
import cn.edu.aynu.service.ProductServiceInter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;
/**
 *@Author:冯君
 **/
@RequestMapping("/product")
@Controller
public class ProductController {

    @Resource
    private ProductServiceInter productService;

    /**
     *@Description: 添加购物车方法
     *@param:  id
     *@param:  session
     *@return String 购物车列表页面
     **/
    @GetMapping("/addCart")
    public String addCart(String id, HttpSession session){
        //根据商品id查询商品详细信息
        Product product = productService.findProductById(id);
        //从session中获取购物车
        Map<Product,Integer> cart = (Map<Product, Integer>) session.getAttribute("cart");
        //购物车不存在需要创建集合
        if(cart==null){
            cart = new HashMap();
        }
        Integer count = cart.put(product, 1);

        if(count!=null){
            cart.put(product,count+1);
        }
        session.setAttribute("cart",cart);
        return "cart";
    }

}
