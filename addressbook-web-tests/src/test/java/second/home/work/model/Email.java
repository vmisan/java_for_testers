package second.home.work.model;

public class Email {

  private final String firstEmail;
  private final String secondEmail;
  private final String thirdEmail;

  public Email(String firstEmail, String secondEmail, String thirdEmail) {
    this.firstEmail = firstEmail;
    this.secondEmail = secondEmail;
    this.thirdEmail = thirdEmail;
  }

  public String firstEmail() {
    return firstEmail;
  }

  public String secondEmail() {
    return secondEmail;
  }

  public String thirdEmail() {
    return thirdEmail;
  }
}
