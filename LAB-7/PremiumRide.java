public class PremiumRide extends Ride
{
  public boolean surge;
  private static int id = 0; 
  public boolean discount;
  public double fare;
  public int service = 50;
  public PremiumRide(int distance, boolean surge)
  {
    super(distance);
    this.surge = surge;
    id++;
  }
  public int getId()
  {
    return id;
  }
  public String toString()
  {
    return ("Distance: "+(int)getDistance()+" km")
      +("\nID: "+id+"-"+(int)getDistance())
      +("\nService Charge: 50")
      +("\nSurge: "+surge)
      +("\nDiscount: "+discount);
  }
  public double calculateFare()
  {
    fare = ((int)getDistance()*10)+service;
    if(surge == true)
    {
      fare += fare*0.2;
    }
    return fare;
  }
  public double calculateFare(int amount)
  {
    fare = ((int)getDistance()*10)+service;
    if(surge == true)
    {
      fare += fare*0.2;
    }
    discount = true;
    return (fare-amount); 
  }
}