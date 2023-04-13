package is_a_has_a;

public class Date {
  private int year;
  private int month;
  private int date;

  public Date(int argYear, int argMonth, int argDate) {
     date = argDate;
     month = argMonth;
     year = argYear;
  }
  
  public String toString() {
    return "Date [ year=" + year + "month= " + month + "date=" + date + "]";
  }
}