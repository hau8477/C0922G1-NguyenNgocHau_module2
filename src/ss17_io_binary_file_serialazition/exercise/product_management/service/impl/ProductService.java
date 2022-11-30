package ss17_io_binary_file_serialazition.exercise.product_management.service.impl;

import ss17_io_binary_file_serialazition.exercise.product_management.model.Product;
import ss17_io_binary_file_serialazition.exercise.product_management.service.IFileService;

import java.util.List;

public class ProductService implements IFileService<Product> {
    private static final String PATH_FILE = "src/ss17_io_binary_file_serialazition/exercise/product_management/data/binary.txt";
    @Override
    public void addProduct(Product product) {

    }

    @Override
    public List<Product> displayProduct() {
        return null;
    }

    @Override
    public void deleteProduct(int id) {

    }
}
