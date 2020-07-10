package com.luf.ssm.handler;

import com.luf.ssm.beans.Product;
import com.luf.ssm.beans.Student;
import com.luf.ssm.service.ProductService;
import com.luf.ssm.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Map;

@Controller
public class ProductHandler {

    @Autowired
    private ProductService productService;

    @Autowired
    private StudentService studentService;
    /**
     * 显示所有商品信息
     */
    @RequestMapping(value="/products", method= RequestMethod.GET)
    public String listAllProducts(Map<String, Object> map) {
        List<Product> products = productService.getAllProducts();
        map.put("products", products);

        return "displayAll";
    }

    @RequestMapping(value = "/students",method = RequestMethod.GET)
    public String listAllStudent(Map<String,Object> map)
    {
        List<Student>students=studentService.getAllStudent();
        map.put("products",students);
        return "displayAll";
    }

    @RequestMapping(value="/deleteP")
    public String deleteProduct() {
        productService.deleteProduct(104);

        return "success";
    }
}
