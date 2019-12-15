package second.home.work.model;

public class Date {
  private final String Day;
  private final String Month;
  private final String Year;

  public Date(String Day, String Month, String Year) {
    this.Day = Day;
    this.Month = Month;
    this.Year = Year;
  }

  public String getDay() {
    return Day;
  }

  public String getMonth() {
    return Month;
  }

  public String getYear() {
    return Year;
  }
}
