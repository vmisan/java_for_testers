package second.home.work.model;

public class UserInfo {
  private final String firstName;
  private final String middleName;
  private final String lastName;
  private final String nickName;
  private final String title;
  private final String companyName;
  private final String companyAddress;

 // private final String homeTelephoneNumber;
 // private final String mobileTelephoneNumber;
 // private final String workTelephoneNumber;
 // private final String faxNumber;

  public UserInfo(String firstName, String middleName, String lastName, String nickName, String title, String companyName, String companyAddress) {
    this.firstName = firstName;
    this.middleName = middleName;
    this.lastName = lastName;
    this.nickName = nickName;
    this.title = title;
    this.companyName = companyName;
    this.companyAddress = companyAddress;
  }


  public String getFirstName() {
    return firstName;
  }

  public String getMiddleName() {
    return middleName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getNickName() {
    return nickName;
  }

  public String getTitle() {
    return title;
  }

  public String getCompanyName() {
    return companyName;
  }

  public String getCompanyAddress() {
    return companyAddress;
  }
}
