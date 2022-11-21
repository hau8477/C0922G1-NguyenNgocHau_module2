package ss12_java_collection_framework.exercise.product;

import java.util.Comparator;

public class ProductComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        if (o1.getPriceProduct() > o2.getPriceProduct()) {
            return 1;
        } else if (o1.getPriceProduct() < o2.getPriceProduct()) {
            return -1;
        } else {
            return 0;
        }
    }
}
