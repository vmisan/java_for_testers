package second.home.work.model;

public class SecondaryInfo {
  private final String secondaryAddress;
  private final String secondaryPhone;
  private final String note;

  public SecondaryInfo(String secondaryAddress, String secondaryPhone, String note) {
    this.secondaryAddress = secondaryAddress;
    this.secondaryPhone = secondaryPhone;
    this.note = note;
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
