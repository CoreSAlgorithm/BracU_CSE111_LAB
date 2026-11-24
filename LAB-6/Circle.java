public class Circle extends Shape
{
  public int radius = 0;
  public double areaa = 0.0;
  public void area()
  {
    areaa = 3.1416*radius*radius;
    System.out.println("Area of "+color+" "+name+": "+areaa);
  }
}
