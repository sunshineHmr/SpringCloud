package cn.zyy.client;

import cn.zyy.pojo.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * 这里的这个@FeignClient注解要和数据微服务中的application.yml中的服务注册名一样，要不然会访问页面时报错
 */
@FeignClient(value="product-data-service")
public interface ProductClientFeign {
    @GetMapping("/products")
    public List<Product> listProducts();
}
