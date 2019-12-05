package tests;

import org.testng.annotations.*;
import model.GroupData;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {
    app.gotoGroupPage();
    app.initGroupCreation();
    app.fillGroupForm(new GroupData("first group", "logo", "footer"));
    app.submitGroupCreation();
    app.returnToGroupPage();
  }
}