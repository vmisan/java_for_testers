package second.home.work;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ContactCreationTests {
  private WebDriver wd;

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
   wd = new FirefoxDriver();
    wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    login("admin", "secret");
  }

  private void login(String username, String password) {
    wd.get("http://localhost/addressbook/");
    wd.findElement(By.name("user")).click();
    wd.findElement(By.name("user")).sendKeys(username);
    wd.findElement(By.name("pass")).click();
    wd.findElement(By.name("pass")).sendKeys(password);
    wd.findElement(By.xpath("//input[@value='Login']")).click();
  }

  @Test
  public void testConactCreationTests() throws Exception {
    goToCreateNewContactPage();
    fillUserInfo(new UserInfo("Viktar", "Viktaravich", "Misan", "obroxo", "QA", "Best company ever", "Main str. 1"));
    fillTelephoneNumbers(new TelephoneNumber("80171234567", "80291234567", "80331234567", "80441234567"));
    fillEmail();
    fillHomePage();
    fillBirthDay(new Birthday("3", "May", "1987"));
    fillAnniversary("19", "September", "2015");
    selectGroupForContact();
    fillSecondaryAddress(new SecondaryInfo("Best street ever 1, best home ever 1", "Novoelnya", "I have completed it!"));
    submitNewContact();
    goToMainPage();
  }

  private void goToMainPage() {
    wd.findElement(By.linkText("home page")).click();
  }

  private void submitNewContact() {
    wd.findElement(By.xpath("(//input[@name='submit'])[2]")).click();
  }

  private void fillSecondaryAddress(SecondaryInfo secondaryInfo) {
    wd.findElement(By.name("address2")).click();
    wd.findElement(By.name("address2")).sendKeys(secondaryInfo.getSecondaryAddress());
    wd.findElement(By.name("phone2")).click();
    wd.findElement(By.name("phone2")).sendKeys(secondaryInfo.getSecondaryPhone());
    wd.findElement(By.name("notes")).click();
    wd.findElement(By.name("notes")).sendKeys(secondaryInfo.getNote());
  }

  private void selectGroupForContact() {
    wd.findElement(By.name("theform")).click();
    wd.findElement(By.name("new_group")).click();
    new Select(wd.findElement(By.name("new_group"))).selectByVisibleText("first group");
  }

  private void fillAnniversary(String aDay, String aMonth, String aYear) {
    wd.findElement(By.name("aday")).click();
    new Select(wd.findElement(By.name("aday"))).selectByVisibleText(aDay);
    wd.findElement(By.name("aday")).click();
    wd.findElement(By.name("amonth")).click();
    new Select(wd.findElement(By.name("amonth"))).selectByVisibleText(aMonth);
    wd.findElement(By.name("ayear")).click();
    wd.findElement(By.name("ayear")).sendKeys(aYear);
  }

  private void fillBirthDay(Birthday birthday) {
    wd.findElement(By.name("bday")).click();
    new Select(wd.findElement(By.name("bday"))).selectByVisibleText(birthday.getbDay());
    wd.findElement(By.name("bmonth")).click();
    new Select(wd.findElement(By.name("bmonth"))).selectByVisibleText(birthday.getbMonth());
    wd.findElement(By.name("byear")).click();
    wd.findElement(By.name("byear")).sendKeys(birthday.getbYear());
  }

  private void fillHomePage() {
    wd.findElement(By.name("homepage")).sendKeys("tut.by");
  }

  private void fillEmail() {
    wd.findElement(By.name("email")).click();
    wd.findElement(By.name("email")).sendKeys("viktar@test.com");
    wd.findElement(By.name("email2")).click();
    wd.findElement(By.name("email2")).sendKeys("viktar@test.com");
    wd.findElement(By.name("email3")).click();
    wd.findElement(By.name("email3")).sendKeys("viktar@test.com");
    wd.findElement(By.name("homepage")).click();
  }

  private void fillTelephoneNumbers(TelephoneNumber telephoneNumber) {
    wd.findElement(By.name("home")).click();
    wd.findElement(By.name("home")).sendKeys(telephoneNumber.getHomeTelephoneNumber());
    wd.findElement(By.name("mobile")).click();
    wd.findElement(By.name("mobile")).sendKeys(telephoneNumber.getMobileTelephoneNumber());
    wd.findElement(By.name("work")).click();
    wd.findElement(By.name("work")).sendKeys(telephoneNumber.getWorkTelephoneNumber());
    wd.findElement(By.name("fax")).click();
    wd.findElement(By.name("fax")).sendKeys(telephoneNumber.getFaxNumber());
  }

  private void fillUserInfo(UserInfo userInfo) {
    wd.findElement(By.name("firstname")).click();
    wd.findElement(By.name("firstname")).sendKeys(userInfo.getFirstName());
    wd.findElement(By.name("theform")).click();
    wd.findElement(By.name("middlename")).sendKeys(userInfo.getMiddleName());
    wd.findElement(By.name("lastname")).click();
    wd.findElement(By.name("lastname")).sendKeys(userInfo.getLastName());
    wd.findElement(By.name("nickname")).click();
    wd.findElement(By.name("nickname")).sendKeys(userInfo.getNickName());
    wd.findElement(By.name("title")).click();
    wd.findElement(By.name("title")).sendKeys(userInfo.getTitle());
    wd.findElement(By.name("company")).click();
    wd.findElement(By.name("company")).sendKeys(userInfo.getCompanyName());
    wd.findElement(By.name("address")).click();
    wd.findElement(By.name("address")).sendKeys(userInfo.getCompanyAddress());
  }

  private void goToCreateNewContactPage() {
    wd.findElement(By.linkText("add new")).click();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    wd.quit();
  }

  private boolean isElementPresent(By by) {
    try {
      wd.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      wd.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

}
