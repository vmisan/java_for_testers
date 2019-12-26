package second.home.work.tests;

import second.home.work.model.*;
import org.testng.annotations.Test;

public class ContactModificationTests extends TestBase {

  @Test
  public void testContactModification() {
    app.getContactHelper().selectCertainContact();
    app.getContactHelper().fillUserInfo(new ContactData("ViktarEdited", "MisanEdited", "ComEdited", "80291111111", "1edited@gmail.com", null), false);
    app.getContactHelper().updateCertainContact();
  }
}
