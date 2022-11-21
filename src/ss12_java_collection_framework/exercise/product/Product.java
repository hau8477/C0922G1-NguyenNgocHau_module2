package ss12_java_collection_framework.exercise.product;

public class Product {
    private int idProduct;
    private String nameProduct;
    private double priceProduct;


    public Product(int idProduct, String nameProduct, double priceProduct) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
    }

    public Product() {
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(double priceProduct) {
        this.priceProduct = priceProduct;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    @Override
    public String toString() {
        return "Product{" +
                " nameProduct = '" + nameProduct + '\'' +
                ", priceProduct = " + priceProduct +
                ", idProduct = " + idProduct +
                '}';
    }
}
