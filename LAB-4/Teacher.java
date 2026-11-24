public class Teacher
{
  public String name = "";
  public String initial = "";
  public String[] course = new String[3];
  public int count = 0;
  public Teacher(String name1, String initial)
  {
    this.name = name;
    this.initial = initial;
    System.out.println("A new teacher has been created");
  }
  public void addCourse(Course c)
  {
    this.course[count] = c.name;
    count++;
  }
  public void printDetail()
  {
    System.out.println("Name: "+this.name);
    System.out.println("Initial: "+this.initial);
    System.out.println("List of courses:");
    for(int i=0; i<count; i++)
    {
      System.out.println(this.course[i]);
    }
  }
}
