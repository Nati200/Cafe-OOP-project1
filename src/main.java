public class main {
    public static void main(String[] args) {
        cafe c = new cafe();

        c.addproducts();
        c.showproduct();
        
        c.removeProduct("Tea");

        c.showproduct();

    }
}
