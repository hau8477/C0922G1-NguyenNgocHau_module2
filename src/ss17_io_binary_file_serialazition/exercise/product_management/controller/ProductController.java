package ss17_io_binary_file_serialazition.exercise.product_management.controller;

import ss17_io_binary_file_serialazition.exercise.product_management.model.Product;
import ss17_io_binary_file_serialazition.exercise.product_management.service.IProductService;
import ss17_io_binary_file_serialazition.exercise.product_management.service.impl.ProductServiceImpl;

import java.util.List;

public class ProductController {

    private final IProductService productService = new ProductServiceImpl();

    public void add(Product product) {
        this.productService.add(product);
    }

    public List<Product> getAllProduct(){
        return this.productService.getAllProduct();
    }

    public boolean findProductInfo(int id){
        this.productService.findProductInfo(id);
        return true;
    }
}
