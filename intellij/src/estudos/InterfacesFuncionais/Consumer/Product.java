package estudos.InterfacesFuncionais.Consumer;

public class Product {

    private String name;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public static void staticPriceUpdate(Product product){
        product.setPrice(product.getPrice() * 1.1);
    }
    public void nonStaticPriceUpdate(){
        setPrice(price * 1.1);
    }

}
