public class Shape
{
  public String name;
  public int radius;
  public double l;
  public double w;
  public double area;
  public void setParameters(String name, int radius)
  {
    this.radius = radius;
    this.area = 3.1416*radius*radius;
  }
  public void setParameters(String name, double l,double w)
  {
    this.name = name;
    if(name.equals("Triangle"))
    {
      this.area = 0.5*l*w;
    }
    else 
    {
      this.area = l*w;
    }
  }
  public String details()
  {
    return "Shape name: "+name+"\nArea: "+area;
  }
}