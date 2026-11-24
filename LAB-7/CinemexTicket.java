public class CinemexTicket extends MovieTicket
{
  public String genre = "";
  public static int TotalTickets = 0;
  public String status = "Not Paid";
  public int hour = 0;
  public CinemexTicket(String movie, String showtime, String genre, String date)
  {
    super(movie,date,showtime, 0.0);
    this.genre = genre;
    super.seat = "Regular";
    TotalTickets++;
  }
  public CinemexTicket(String movie, String showtime, String genre, String date,String seat)
  {
    super(movie,date,showtime, 0.0);
    this.genre = genre;
    super.seat = seat;
    TotalTickets++;
  }
  public static int getTotalTickets()
  {
    return TotalTickets;
  }
  public void calculateTicketPrice()
  {
    split();
    if(hour >= 18 && hour <= 23)
    {
      if(seat.equals("Regular"))
      {
        setPrice(300.0+(300.0*0.15));
      }
      else if(seat.equals("Premium"))
      {
        setPrice(450.0+(450.0*0.15));
      }
      else if(seat.equals("IMAX 3D"))
      {
        setPrice(600.0+(600.0*0.15));
      }
    }
    else
    {
      if(seat.equals("Regular"))
      {
        setPrice(300.0);
      }
      else if(seat.equals("Premium"))
      {
        setPrice(450.0);
      }
      else if(seat.equals("IMAX 3D"))
      {
        setPrice(600.0);
      }
    }
    System.out.println("Ticket price is calculated successfully.");
  }
  public void split()
  {
    String[] time = super.showtime.split(":");
    hour = Integer.parseInt(time[0]);
    int minute = Integer.parseInt(time[1]);
  }
  public String toString()
  {
    String id = "";
    if(seat.equals("Regular"))
    {
      id = getMovie()+"-R-"+TotalTickets;
    }
    else if(seat.equals("Premium"))
    {
      id = getMovie()+"-P-"+TotalTickets;
    }
    else if(seat.equals("IMAX 3D"))
    {
      id = getMovie()+"-I-"+TotalTickets;
    }
    return "Ticket ID: "+id
      +"\nMovie: "+getMovie()
      +"\nShowtime: "+showtime
      +"\nDate: "+date
      +"\nGenre: "+genre
      +"\nSeat Type: "+seat
      +"\nPrice: "+getPrice()
      +"\nStatus: "+status;
  }
  public String confirmPayment()
  {
    if(status == "Paid")
    {
      return "Ticket price is already paid!";
    }
    else
    {
      status = "Paid";
      return "Payment Successful";
    }
  }
}