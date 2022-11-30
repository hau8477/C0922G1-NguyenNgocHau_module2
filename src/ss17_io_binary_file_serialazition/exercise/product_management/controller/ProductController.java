package ss17_io_binary_file_serialazition.exercise.product_management.controller;

import ss17_io_binary_file_serialazition.exercise.product_management.model.Product;
import ss17_io_binary_file_serialazition.exercise.product_management.service.IProductService;
import ss17_io_binary_file_serialazition.exercise.product_management.service.impl.ProductServiceImpl;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProductController {

    private final IProductService productService = new ProductServiceImpl();

    public void add(Product product) {
        try {
            this.productService.addProduct(product);
        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Product> getAllProduct(){
        try {
            return this.productService.getAllProduct();
        } catch (IOException e) {
            System.err.println("Error " + e.getMessage());
            return new ArrayList<>();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean findProductInfo(int id){
        try {
            this.productService.findProductInfo(id);
        } catch (IOException e) {
            System.err.println("Error " + e.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return true;
    }
}
