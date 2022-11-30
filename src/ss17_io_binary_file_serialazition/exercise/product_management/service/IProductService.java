package ss17_io_binary_file_serialazition.exercise.product_management.service;

import ss17_io_binary_file_serialazition.exercise.product_management.model.Product;

import java.io.IOException;
import java.util.List;

public interface IProductService {
    void addProduct(Product product) throws IOException, ClassNotFoundException;

    List<Product> getAllProduct() throws IOException, ClassNotFoundException;

    boolean findProductInfo(int id) throws IOException, ClassNotFoundException;

}