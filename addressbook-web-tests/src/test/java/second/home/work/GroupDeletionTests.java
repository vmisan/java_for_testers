package second.home.work;

import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase{

  @Test
  public void testGroupDeletion() throws Exception {
   gotoGroupPage();
    selectGroup();
    deleteSelectedGroups();
    returnToGroupPage();
  }

}
