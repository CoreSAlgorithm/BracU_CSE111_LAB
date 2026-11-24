public class Electronics extends Product
{
  public int warrenty = 0;
  public boolean p ;
  public Electronics(String productName, double price, int warrenty)
  {
    super(productName,price);
    this.warrenty = warrenty;
  }
  public void displayInfo()
  {
    System.out.println("Electronics: " + super.productName +", Price: $" + super.price+", Warrenty: "+warrenty+" months");
  }
  public void displayInfo(boolean p)
  {
    this.p = p;
    System.out.println("Electronics: " + super.productName +", Warrenty: 12 months");
  }
}