package ss17_io_binary_file_serialazition.exercise.product_management.service.impl;

import ss17_io_binary_file_serialazition.exercise.product_management.model.Product;
import ss17_io_binary_file_serialazition.exercise.product_management.service.IProductService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements IProductService {

    public static final String PATH_FILE =
            "src/ss17_io_binary_file_serialazition/exercise/product_management/reponsitory/reponsitory.txt";

    @Override
    public void add(Product product) {
        List<Product> products = new ArrayList<>();
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
        return;
    }

    @Override
    public List<Product> getAllProduct() {
        List<Product> productList;
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;

        try {
            fileInputStream = new FileInputStream(PATH_FILE);
            objectInputStream = new ObjectInputStream(fileInputStream);
            productList = (List<Product>) objectInputStream.readObject();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                objectInputStream.close();
                fileInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return productList;
    }

    @Override
    public boolean findProductInfo(int id) {
        List<Product> products = getAllProduct();
        for (Product p : products) {
            if (id == p.getId()) {
                return true;
            }
        }
        return false;
    }
}
