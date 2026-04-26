public class Cafe {
    product p1;
    product p2;

    public void addproducts() {
        p1 = new product("Coffee", 50);
        p2 = new product("Tea", 30);
    }

    public void showproduct() {
        System.out.println("Menu:");
        if (p1 != null) p1.display();

        if (p2 != null) p2.display();

    }
    public void removeProduct(String productName){
        if (p1 != null && p1.name.equalsIgnoreCase(productName)) {
            p1 = null;
            System.out.println(productName + " removed");
        }

        if (p2 != null && p2.name.equalsIgnoreCase(productName)) {
            p2 = null;
            System.out.println(productName + " removed");
        }
    }
}

