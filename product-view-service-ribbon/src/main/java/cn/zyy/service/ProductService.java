package cn.zyy.service;

import cn.zyy.client.ProductClientRibbon;
import cn.zyy.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductClientRibbon productClientRibbon;

    public List<Product> listProducts(){
        return productClientRibbon.listProducts();
    }
}
