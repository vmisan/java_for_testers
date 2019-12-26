package second.home.work.tests;

import second.home.work.model.*;
import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {

  @Test
  public void testConactCreationTests() throws Exception {
    app.getContactHelper().goToCreateNewContactPage();
    app.getContactHelper().fillUserInfo(new ContactData("Viktar", "Misan", "Minsk, Engelsa 34", "80171234567", "1@test.test"));
    app.getContactHelper().selectGroupForContact();
    app.getContactHelper().submitNewContact();
    app.getNavigationHelper().goToMainPage();
  }
}

