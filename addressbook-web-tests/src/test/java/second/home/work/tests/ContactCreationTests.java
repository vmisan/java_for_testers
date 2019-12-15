package second.home.work.tests;

import second.home.work.model.*;
import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {

  @Test
  public void testConactCreationTests() throws Exception {
    app.getContactHelper().goToCreateNewContactPage();
    app.getContactHelper().fillUserInfo(new UserInfo("Viktar", "Viktaravich", "Misan", "obroxo", "QA", "Best company ever", "Main str. 1"));
    app.getContactHelper().fillTelephoneNumbers(new TelephoneNumber("80171234567", "80291234567", "80331234567", "80441234567"));
    app.getContactHelper().fillEmail(new Email("1@test.test", "2@test.test", "3@test.test"));
    app.getContactHelper().fillHomePage("tut.by");
    app.getContactHelper().fillBirthDay(new Date("3", "May", "1987"));
    app.getContactHelper().fillAnniversary(new Date("19", "September", "2015"));
    app.getContactHelper().selectGroupForContact();
    app.getContactHelper().fillSecondaryAddress(new SecondaryInfo("Best street ever 1, best home ever 1", "Novoelnya", "I have completed it!"));
    app.getContactHelper().submitNewContact();
    app.getNavigationHelper().goToMainPage();
  }

}

