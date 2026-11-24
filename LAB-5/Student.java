public class Student
{
  public String name = "";
  public int code = 0;
  public int trace = 0;
  public static int idCount = 0;
  public static int totalMarks = 0;
  public static int total_students = 0;
  public static double average = 0;
  public Student(String name)
  {
    this.name = name;
    this.total_students++;
    this.idCount++;
  }
  public Student(String name, int code, int trace)
  {
    this.name = name;
    this.code = code;
    this.trace = trace;
    this.total_students++;
    this.idCount++;
    this.totalMarks += code+trace;
  }
  public void setCodingMarks(int code)
  {
    this.code = code;
    this.totalMarks += code;
  }
  public void setTracingMarks(int trace)
  {
    this.trace = trace;
    this.totalMarks += trace;
  }
  public static double averageMarks()
  {
    if(total_students == 0)
    {
      return 0;
    }
    else
    {
      return (double) totalMarks / total_students;
    }
  }
  public void individualDetail()
  {
    System.out.println("Name: "+this.name);
    System.out.println("ID: "+this.idCount);
    System.out.println("Coding Marks: "+this.code);
    System.out.println("Tracing Marks: "+trace);
    if((this.code+this.trace)<50)
    {
      System.out.println("Mike has failed with "+(this.code+this.trace)+" marks");
    }
    else
    {
      System.out.println("Will has passed with "+(this.code+this.trace)+" marks");
    }
  }
}