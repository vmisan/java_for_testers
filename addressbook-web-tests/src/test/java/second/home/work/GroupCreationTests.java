package second.home.work;

import org.testng.annotations.*;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {
    gotoGroupPage();
    initGroupCreation();
    fillGroupForm(new GroupData("first group", "logo", "footer"));
    submitGroupCreation();
    returnToGroupPage();
  }
}