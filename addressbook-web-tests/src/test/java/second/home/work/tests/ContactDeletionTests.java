package second.home.work.tests;

import org.testng.annotations.Test;

public class ContactDeletionTests extends TestBase {
  
  @Test
  public void testContactDeletion(){
    app.getContactHelper().selectCertainContact();
    app.getContactHelper().deleteCertainContact();
  }
}
