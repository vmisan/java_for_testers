package second.home.work.tests;

import org.testng.annotations.*;
import second.home.work.model.GroupData;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {
    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().createGroup(new GroupData("first group", "logo", "footer"));
  }

  @Test
  public void testGroupCreation2() throws Exception {
    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().createGroup(new GroupData("first group", null, null));
  }
}


