package second.home.work.appmanager;

import second.home.work.model.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactHelper extends BaseHelper {

  public ContactHelper(WebDriver wd) {
    super(wd);
  }

  public void submitNewContact() {
    click(By.xpath("(//input[@name='submit'])[2]"));
  }

  public void fillUserInfo(ContactData2 userInfo) {
    type(By.name("firstname"), userInfo.getFirstName());
    type(By.name("middlename"), userInfo.getMiddleName());
    type(By.name("lastname"), userInfo.getLastName());
    type(By.name("nickname"), userInfo.getNickName());
    type(By.name("title"), userInfo.getTitle());
    type(By.name("company"), userInfo.getCompanyName());
    type(By.name("address"), userInfo.getCompanyAddress());
  }

  public void fillTelephoneNumbers(TelephoneNumber telephoneNumber) {
    type(By.name("home"), telephoneNumber.getHomeTelephoneNumber());
    type(By.name("mobile"), telephoneNumber.getMobileTelephoneNumber());
    type(By.name("work"), telephoneNumber.getWorkTelephoneNumber());
    type(By.name("fax"), telephoneNumber.getFaxNumber());
  }

  public void fillEmail(Email email) {
    type(By.name("email"), email.firstEmail());
    type(By.name("email2"), email.secondEmail());
    type(By.name("email3"), email.thirdEmail());
  }

  public void fillHomePage(String homepage) {
    type(By.name("homepage"), homepage);
  }

  public void fillBirthDay(Date birthday) {
    selectDate(By.name("bday"), By.name("bmonth"), By.name("byear"), birthday);
  }

  public void fillAnniversary(Date anniversaryDay) {
    selectDate(By.name("aday"), By.name("amonth"), By.name("ayear"), anniversaryDay);
  }

  public void goToCreateNewContactPage() {
    click(By.linkText("add new"));
  }

  public void selectGroupForContact() {
    select(By.name("new_group"), "first group");
  }

  public void fillSecondaryAddress(SecondaryInfo secondaryInfo) {
    type(By.name("address2"), secondaryInfo.getSecondaryAddress());
    type(By.name("phone2"), secondaryInfo.getSecondaryPhone());
    type(By.name("notes"), secondaryInfo.getNote());
  }

  public void selectCertainContact() {
    click(By.xpath("//img[@alt='Edit']"));
  }

  public void deleteCertainContact() {
    click(By.xpath("(//input[@name='update'])[3]"));
  }

  public void updateCertainContact() {
    click(By.xpath("(//input[@name='update'])[2]"));
  }
}
