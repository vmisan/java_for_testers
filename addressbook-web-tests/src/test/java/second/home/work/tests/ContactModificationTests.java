package second.home.work.tests;

import second.home.work.model.*;
import org.testng.annotations.Test;

public class ContactModificationTests extends TestBase {

  @Test
  public void testContactModification() {
    if(! app.getContactHelper().isThereAContact()){
      app.getContactHelper().createContact(new ContactData("Viktar", "Misan", "Minsk, Engelsa 34", "80171234567", "1@test.test", null), true);
    }
    app.getNavigationHelper().goToMainPage();
    app.getContactHelper().selectCertainContact();
    app.getContactHelper().fillUserInfo(new ContactData("ViktarEdited", "MisanEdited", "ComEdited", "80291111111", "1edited@gmail.com", null), false);
    app.getContactHelper().updateCertainContact();
  }
}
