package ss17_io_binary_file_serialazition.exercise.product_management.service;

import ss17_io_binary_file_serialazition.exercise.product_management.model.Product;

import java.util.List;

public interface IProductService {
    void add(Product product);

    List<Product> getAllProduct();

    boolean findProductInfo(int id);

}
