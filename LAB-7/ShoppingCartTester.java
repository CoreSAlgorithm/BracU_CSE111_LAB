public class ShoppingCartTester{
 public static void main(String[] args) {
  Product p1 = new Product("Notebook", 4.99);
  Clothing c1 = new Clothing("T-Shirt", 19.99, "M");
  Electronics e1 = new Electronics("Laptop", 999.99, 24);
  p1.displayInfo();
  c1.displayInfo();
  e1.displayInfo();
  System.out.println("Total products created : " + Product.totalProducts);
  Electronics e2 = new Electronics("Smartphone", 799.99, 12);
  e2.displayInfo(false);
 }
}

class Product {
  public String productName;
  public double price;
  public static int totalProducts = 0;
  
  public Product(String productName, double price) {
    this.productName = productName;
    this.price = price;
    totalProducts++;
  }
  public void displayInfo() {
    System.out.println("Product: " + productName + ", Price: $" + price);
  }
}
