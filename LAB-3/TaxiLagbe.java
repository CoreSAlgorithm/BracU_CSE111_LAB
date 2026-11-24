public class TaxiLagbe
{
  public String number;
  public String area ="Khulna";
  public String[] passenger = new String[4];
  public int count = 0;
  public int fare = 0; 
  public TaxiLagbe(String number, String area)
  {
    this.number = number;
    this.area = area;
    System.out.println("A new taxi has been created");
  }
  public TaxiLagbe(String number)
  {
    this.number = number;
    System.out.println("A new taxi has been created");
  }
  public void printDetails()
  {
    System.out.println("Taxi number: "+this.number);
    System.out.println("This taxi can cover "+this.area+" area.");
    System.out.println("Total passenger: "+count);
    System.out.println("Passenger List: ");
    for(int i=0; i<count; i++)
    {
      System.out.print(this.passenger[i]+" ");
    }
    System.out.println("\nTotal collected fare: "+this.fare);
  }
  public void addPassenger(String passenger, int fare)
  {
    if(count < 4)
    {
      this.passenger[count] = passenger;
      System.out.println("Dear "+this.passenger[count]+"! Welcome to taxiLagbe");
      count++;
      this.fare += fare;
    }
    else
    {
      System.out.println("Taxi Full! No more passenger can be added.");
    }
  }
  public void addPassenger(String passenger, int fare,String passenger2, int fare2)
  {
    if(count < 4)
    {
      this.passenger[count] = passenger;
      System.out.println("Dear "+this.passenger[count]+"! Welcome to taxiLagbe");
      count++;
      this.fare += fare;
      this.passenger[count] = passenger2;
      System.out.println("Dear "+this.passenger[count]+"! Welcome to taxiLagbe");
      count++;
      this.fare += fare2;
    }
    else
    {
      System.out.println("Taxi Full! No more passenger can be added.");
    }
  }
}