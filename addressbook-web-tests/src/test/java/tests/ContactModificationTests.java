package tests;

import model.*;
import org.testng.annotations.Test;

public class ContactModificationTests extends TestBase {

  @Test
  public void testContactModification() {
    app.getContactHelper().selectCertainContact();
    app.getContactHelper().fillUserInfo(new UserInfo("ViktarEdited", "ViktaravichEdited", "MisanEdited", "obroxoEdited", "QA", "Best company ever", "Main str. 1"));
    app.getContactHelper().fillTelephoneNumbers(new TelephoneNumber("80170987654", "80290987654", "80330987654", "80440987654"));
    app.getContactHelper().fillEmail(new Email("1edited@test.test", "2edited@test.test", "3edited@test.test"));
    app.getContactHelper().fillHomePage("onliner.by");
    app.getContactHelper().fillBirthDay(new Date("30", "December", "1988"));
    app.getContactHelper().fillAnniversary(new Date("28", "December", "2017"));
    app.getContactHelper().fillSecondaryAddress(new SecondaryInfo("Best street ever 1 EDITED, best home ever 1", "NovoelnyaEdited", "I have completed it! Edited."));
    app.getContactHelper().updateCertainContact();
  }
}
