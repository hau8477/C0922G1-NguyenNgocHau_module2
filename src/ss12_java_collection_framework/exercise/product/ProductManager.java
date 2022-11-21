package ss12_java_collection_framework.exercise.product;

import java.util.*;

public class ProductManager {
    private final List<Product> products = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void addProduct() {
        System.out.println("-------------Add Product------------");
        System.out.print("Enter id product: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter name product: ");
        String name = scanner.nextLine();
        System.out.print("Enter price product: ");
        double price = Double.parseDouble(scanner.nextLine());
        Product product = new Product(id, name, price);

        products.add(product);
    }

    public void editProduct() {
        displayProduct();
        System.out.println("-------------Edit Product------------");
        System.out.println("Enter the product id you want to edit: ");
        int id = Integer.parseInt(scanner.nextLine());

        for (Product product : products) {
            if (product.getIdProduct() == id) {
                System.out.print("Enter new id product: ");
                int idNew = Integer.parseInt(scanner.nextLine());
                System.out.print("Enter new name product: ");
                String nameNew = scanner.nextLine();
                System.out.print("Enter new price product: ");
                double priceNew = Double.parseDouble(scanner.nextLine());
                product.setIdProduct(idNew);
                product.setPriceProduct(priceNew);
                product.setNameProduct(nameNew);
            } else {
                System.out.println("Id does not exist");
            }
        }
    }

    public void deleteProduct() {
        displayProduct();
        System.out.println("------------Delete Product-------------");
        System.out.print("Enter the product id you want to delete: ");
        int id = Integer.parseInt(scanner.nextLine());

        Product deletedProduct = null;
        for (Product product : products) {
            if (id == product.getIdProduct()) {
                deletedProduct = product;
                break;
            } else {
                System.out.println("Id does not exist");
            }
        }

        if (deletedProduct != null) products.remove(deletedProduct);
    }

    public void displayProduct() {
        System.out.println("------------Display Product-------------");

        for (Product product : products) {
            System.out.println(product.toString());
        }
    }

    public void findProduct() {
        System.out.println("------------Find Product-------------");
        System.out.print("Enter the product name you want to find: ");
        String name = scanner.nextLine();

        for (Product product : products) {
            if (Objects.equals(product.getNameProduct(), name)) {
                System.out.println(product.toString());
            }
        }
    }

    public void sortProductLowToHigh() {
        System.out.println("------------Sort ascending by price-------------");
        ProductComparator productComparator = new ProductComparator();
        products.sort(productComparator);
    }

    public void sortProductHighToLow() {
        System.out.println("------------Sort descending by price-------------");
        sortProductLowToHigh();
        Collections.reverse(products);
    }

}
