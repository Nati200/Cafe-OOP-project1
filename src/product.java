public class product {
    String name;
    double price;

    public product(String name, double price){
        this.name = name;
        this.price = price;
    }

    public void display() {
        System.out.println(name + "-$" + price);
    }
}