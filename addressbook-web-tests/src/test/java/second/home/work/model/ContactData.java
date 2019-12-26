package second.home.work.model;

public class ContactData {
  private String firstName;
  private String lastName;
  private String companyAddress;
  private String homeTelephoneNumber;
  private String firstEmail;
  //private String secondaryAddress;


  public ContactData(String firstName, String lastName, String companyAddress, String homeTelephoneNumber, String firstEmail) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.companyAddress = companyAddress;
    this.homeTelephoneNumber = homeTelephoneNumber;
    this.firstEmail = firstEmail;
   // this.secondaryAddress = secondaryAddress;
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
/*
  public String getSecondaryAddress() {
    return secondaryAddress;
  }*/

}
