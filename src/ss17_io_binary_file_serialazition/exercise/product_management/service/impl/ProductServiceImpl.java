package ss17_io_binary_file_serialazition.exercise.product_management.service.impl;

import ss17_io_binary_file_serialazition.exercise.product_management.model.Product;
import ss17_io_binary_file_serialazition.exercise.product_management.service.IProductService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements IProductService {

    private static final String PATH_FILE =
            "src/ss17_io_binary_file_serialazition/exercise/product_management/data/reponsitory.txt";
    @Override
    public void addProduct(Product product) throws IOException, ClassNotFoundException {
        List<Product> products = getAllProduct();

        for (Product p : products) {
            if (p.getId() == product.getId()) {
                System.out.println("Id already exists");
                return;
            }
        }
        products.add(product);

        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;

        try {
            fileOutputStream = new FileOutputStream(PATH_FILE);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(products);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                objectOutputStream.close();
                fileOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public List<Product> getAllProduct() throws IOException, ClassNotFoundException {
        File file = new File(PATH_FILE);
        List<Product> products;

        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        products = (List<Product>) objectInputStream.readObject();
        objectInputStream.close();
        fileInputStream.close();
        return products;
    }

    @Override
    public boolean findProductInfo(int id) throws IOException, ClassNotFoundException {
        List<Product> products = getAllProduct();
        for (Product p : products) {
            if (id == p.getId()) {
                return true;
            }
        }
        return false;
    }
}