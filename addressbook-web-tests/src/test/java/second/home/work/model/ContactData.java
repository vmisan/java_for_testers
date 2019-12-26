package second.home.work.model;

public class ContactData {
  private String firstName;
  private String lastName;
  private String companyAddress;
  private String homeTelephoneNumber;
  private String firstEmail;
  private String group;

  public ContactData(String firstName, String lastName, String companyAddress, String homeTelephoneNumber, String firstEmail, String group) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.companyAddress = companyAddress;
    this.homeTelephoneNumber = homeTelephoneNumber;
    this.firstEmail = firstEmail;
    this.group = group;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getCompanyAddress() {
    return companyAddress;
  }

  public String getHomeTelephoneNumber() {
    return homeTelephoneNumber;
  }

  public String firstEmail() {
    return firstEmail;
  }

  public String getGroup() {
    return group;
  }
}
