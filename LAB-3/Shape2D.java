public class Shape2D
{
  public String name = "Square";
  public int length = 5;
  public int width = 0;
  public int height = 0;
  public int base = 0;
  public double s ;
  public int a,b,c;
  public double area;
  public Shape2D()
  {
    System.out.println("A "+this.name+" has been created with length: "+this.length);
  }
  public void area()
  {
    if(this.name.equals("Square"))
    {
      this.area = length*length;
      System.out.println("The arae of the square is: "+this.area);
    }
    else if(this.name.equals("Rectangle"))
    {
      this.area = length*width;
      System.out.println("The arae of the Rectangle is: "+this.area);
    }
    else if(this.name.equals("Triangle"))
    {
      this.area = 0.5*base*height;
      System.out.println("The arae of the Triangle is: "+this.area);
    }
    else if(this.name.equals("Triangle2"))
    {
      this.s = (a+b+c)/2;
      this.area = Math.sqrt(this.s*(this.s-a)*(this.s-b)*(this.s-c));
      System.out.println("The arae of the Triangle is: "+this.area);
    }
  }
  public Shape2D(int length, int width)
  {
    this.name = "Rectangle";
    this.length = length;
    this.width = width;
    System.out.println("A "+this.name+" has been created with length: "+this.length+" and width: "+this.width);
  }
  public Shape2D(int height, int base, String name)
  {
    this.name = name;
    this.height = height;
    this.base = base;
    System.out.println("A "+this.name+" has been created with height: "+this.height+" and base: "+this.base);
  }
  public Shape2D(int a, int b, int c)
  {
    this.name = "Triangle2";
    this.a = a;
    this.b = b;
    this.c = c;
    System.out.println("A "+this.name+" has been created with the following sides "+a+","+b+","+c);
  }
}