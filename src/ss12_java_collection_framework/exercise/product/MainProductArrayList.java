package ss12_java_collection_framework.exercise.product;

import java.util.Scanner;

public class MainProductArrayList {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Scanner scanner = new Scanner(System.in);
        System.out.print("--------Product--------- \n" +
                "1. Add product. \n" +
                "2. Edit product. \n" +
                "3. Delete product. \n" +
                "4. Display list product. \n" +
                "5. Find product by name. \n" +
                "6. Sort ascending by price. \n" +
                "7. Sort descending by price. \n" +
                "8. Exit. \n" +
                "Enter selection: \n");
        String choice = scanner.nextLine();
        while (choice.equals("")) {
            System.out.println("Invalid selection. Retype");
            choice = scanner.nextLine();
        }

        while (!choice.equals("8")) {
            switch (choice) {
                case "1":
                    productManager.addProduct();
                    break;
                case "2":
                    productManager.editProduct();
                    break;
                case "3":
                    productManager.deleteProduct();
                    break;
                case "4":
                    productManager.displayProduct();
                    break;
                case "5":
                    productManager.findProduct();
                    break;
                case "6":
                    productManager.sortProductLowToHigh();
                    break;
                case "7":
                    productManager.sortProductHighToLow();
                default:
                    System.out.println("Invalid selection. Retype!");
                    break;
            }

            System.out.print("--------Product--------- \n" +
                    "1. Add product. \n" +
                    "2. Edit product. \n" +
                    "3. Delete product. \n" +
                    "4. Display list product. \n" +
                    "5. Find product by name. \n" +
                    "6. Sort ascending by price. \n" +
                    "7. Sort descending by price. \n" +
                    "8. Exit. \n" +
                    "Enter selection: \n");
            choice = scanner.nextLine();
            while (choice.equals("")) {
                System.out.println("Invalid selection. Retype");
                choice = scanner.nextLine();
            }
        }
    }
}
