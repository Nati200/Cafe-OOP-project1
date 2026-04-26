public class Main {
    public static void main(String[] args) {
        Cafe c = new Cafe();

        c.addproducts();
        c.showproduct();

        c.removeProduct("Tea");

        c.showproduct();

    }
}
