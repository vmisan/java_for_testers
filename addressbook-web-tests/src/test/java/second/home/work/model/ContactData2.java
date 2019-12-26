package second.home.work.model;

public class ContactData2 {
  private String firstName;
  private String middleName;
  private String lastName;
  private String nickName;
  private String title;
  private String companyName;
  private String companyAddress;

  private String homeTelephoneNumber;
  private String mobileTelephoneNumber;
  private String workTelephoneNumber;
  private String faxNumber;

  private String firstEmail;
  private String secondEmail;
  private String thirdEmail;

  private String Day;
  private String Month;
  private String Year;

  private String secondaryAddress;
  private String secondaryPhone;
  private String note;


  public ContactData2 (String firstName, String middleName, String lastName, String nickName, String title, String companyName, String companyAddress, String homeTelephoneNumber, String mobileTelephoneNumber, String workTelephoneNumber, String faxNumber, String firstEmail, String secondEmail, String thirdEmail, String Day, String Month, String Year, String secondaryAddress, String secondaryPhone, String note) {
    this.firstName = firstName;
    this.middleName = middleName;
    this.lastName = lastName;
    this.nickName = nickName;
    this.title = title;
    this.companyName = companyName;
    this.companyAddress = companyAddress;

    this.homeTelephoneNumber = homeTelephoneNumber;
    this.mobileTelephoneNumber = mobileTelephoneNumber;
    this.workTelephoneNumber = workTelephoneNumber;
    this.faxNumber = faxNumber;

    this.firstEmail = firstEmail;
    this.secondEmail = secondEmail;
    this.thirdEmail = thirdEmail;

    this.Day = Day;
    this.Month = Month;
    this.Year = Year;

    this.secondaryAddress = secondaryAddress;
    this.secondaryPhone = secondaryPhone;
    this.note = note;
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

  public String getHomeTelephoneNumber() {
    return homeTelephoneNumber;
  }

  public String getMobileTelephoneNumber() {
    return mobileTelephoneNumber;
  }

  public String getWorkTelephoneNumber() {
    return workTelephoneNumber;
  }

  public String getFaxNumber() {
    return faxNumber;
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

  public String getDay() {
    return Day;
  }

  public String getMonth() {
    return Month;
  }

  public String getYear() {
    return Year;
  }

  public String getSecondaryAddress() {
    return secondaryAddress;
  }

  public String getSecondaryPhone() {
    return secondaryPhone;
  }

  public String getNote() {
    return note;
  }
}
