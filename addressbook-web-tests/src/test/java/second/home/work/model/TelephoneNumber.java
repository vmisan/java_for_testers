package second.home.work.model;

public class TelephoneNumber {
  private final String homeTelephoneNumber;
  private final String mobileTelephoneNumber;
  private final String workTelephoneNumber;
  private final String faxNumber;

  public TelephoneNumber(String homeTelephoneNumber, String mobileTelephoneNumber, String workTelephoneNumber, String faxNumber) {
    this.homeTelephoneNumber = homeTelephoneNumber;
    this.mobileTelephoneNumber = mobileTelephoneNumber;
    this.workTelephoneNumber = workTelephoneNumber;
    this.faxNumber = faxNumber;
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
}
