package ss17_io_binary_file_serialazition.exercise.product_management.service;

import ss17_io_binary_file_serialazition.exercise.product_management.model.Product;

import java.util.List;

public interface IFileService<O> {
    void addProduct(Product product);

    List<O> displayProduct();

    void deleteProduct(int id);
}
