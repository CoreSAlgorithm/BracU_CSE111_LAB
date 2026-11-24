public class Library
{ 
  public int capacity;
  public String[] book;
  public Library(int capacity)
  {
    this.capacity = capacity;
    this.book = new String[capacity];
    System.out.println("A library has been created with capacity "+capacity);
  } 
  public int count = 0;
  public void addBook(String book)
  {
    if(count < capacity)
    {
      this.book[count] = book;
      System.out.println("Book "+"'"+this.book[count]+"'"+" added to the library");
      count++;
    }
    else
    {
      System.out.println("Exceeds maximum capacity. You can't add more than "+capacity+" books");
    }
  }
  public void printDetail()
  {
    System.out.println("Maximum capacity: "+capacity);
    System.out.println("Total books: "+count);
    System.out.println("Book list:");
    for(int i=0; i<count; i++)
    {
      System.out.println(this.book[i]);
    }
  }
}