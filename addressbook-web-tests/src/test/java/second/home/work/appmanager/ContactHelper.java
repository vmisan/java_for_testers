package second.home.work.appmanager;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
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

  public void fillUserInfo(ContactData userInfo, boolean isGroupPresented) {
    type(By.name("firstname"), userInfo.getFirstName());
    type(By.name("lastname"), userInfo.getLastName());
    type(By.name("address"), userInfo.getCompanyAddress());
    type(By.name("home"), userInfo.getHomeTelephoneNumber());
    type(By.name("email"), userInfo.firstEmail());

    if(isGroupPresented){
      if(userInfo.getGroup() != null){
        new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(userInfo.getGroup());
      }else {
        Assert.assertTrue(isElementPresent(By.name("new_group")));
      }
    } else {
      Assert.assertFalse(isElementPresent(By.name("new_group")));
    }
  }

  /*
    public void fillHomePage(String homepage) {
      type(By.name("homepage"), homepage);
    }
  
    public void fillBirthDay(Date birthday) {
      selectDate(By.name("bday"), By.name("bmonth"), By.name("byear"), birthday);
    }
  
    public void fillAnniversary(Date anniversaryDay) {
      selectDate(By.name("aday"), By.name("amonth"), By.name("ayear"), anniversaryDay);
    }
  */
  public void goToCreateNewContactPage() {
    click(By.linkText("add new"));
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

  public void createContact(ContactData contactData, boolean isGroupPresented) {
    goToCreateNewContactPage();
    fillUserInfo(contactData, isGroupPresented);
    submitNewContact();
  }

  public boolean isThereAContact() {
    return isElementPresent(By.name("selected[]"));
  }
}