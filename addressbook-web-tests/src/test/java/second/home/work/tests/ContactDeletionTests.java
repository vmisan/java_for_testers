package second.home.work.tests;

import org.testng.annotations.Test;
import second.home.work.model.ContactData;

public class ContactDeletionTests extends TestBase {
  
  @Test
  public void testContactDeletion(){
    if(! app.getContactHelper().isThereAContact()){
      app.getContactHelper().createContact(new ContactData("Viktar", "Misan", "Minsk, Engelsa 34", "80171234567", "1@test.test", null), true);
    }
    app.getNavigationHelper().goToMainPage();
    app.getContactHelper().selectCertainContact();
    app.getContactHelper().deleteCertainContact();
  }
}
