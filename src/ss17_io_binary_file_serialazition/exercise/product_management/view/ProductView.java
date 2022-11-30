//package ss17_io_binary_file_serialazition.exercise.product_management.view;
//
//import ss17_io_binary_file_serialazition.exercise.product_management.model.Product;
//
//import java.util.List;
//import java.util.Scanner;
//
//public class ProductView {
//
//    private final Scanner scanner = new Scanner(System.in);
//    private final ProductController productController = new ProductController();
//
//    public void displayProductMenu() {
//        int choice;
//
//        do {
//            System.out.print("--------Product--------- \n" +
//                    "1. Add product. \n" +
//                    "2. Display list product. \n" +
//                    "3. Find product by id. \n" +
//                    "4. Exit. \n" +
//                    "Enter selection: \n");
//            choice = Integer.parseInt(scanner.nextLine());
//            switch (choice) {
//                case 1:
//                    System.out.print("Enter id: ");
//                    int id = Integer.parseInt(scanner.nextLine());
//                    System.out.print("Enter name: ");
//                    String name = scanner.nextLine();
//                    System.out.print("Enter brand: ");
//                    String brand = scanner.nextLine();
//                    System.out.print("Enter price: ");
//                    Double price = Double.parseDouble(scanner.nextLine());
//                    System.out.print("Enter describe: ");
//                    String describe = scanner.nextLine();
//
//                    Product product = new Product(id,name,brand,price,describe);
//                    this.productController.add(product);
//                    break;
//                case 2:
//                    List<Product> products = this.productController.getAllProduct();
//                    for (Product p: products) {
//                        System.out.println(p.toString());
//                    }
//                    break;
//                case 3:
//                    System.out.print("Enter id to find: ");
//                    int idFind = Integer.parseInt(scanner.nextLine());
//
//                    boolean checkProduct = this.productController.findProductInfo(idFind);
//                    if (checkProduct) {
//                        for (Product p: this.productController.getAllProduct()) {
//                            if (p.getId() == idFind) {
//                                System.out.println(p);
//                            }
//                        }
//                    } else {
//                        System.out.println("Invalid id.");
//                    }
//                    break;
//                case 4:
//                    System.exit(0);
//                    break;
//                default:
//                    System.out.println("Invalid input.");
//            }
//        } while (true);
//    }
//}