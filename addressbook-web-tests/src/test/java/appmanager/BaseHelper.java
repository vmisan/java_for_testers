package appmanager;

import model.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BaseHelper {
  protected WebDriver wd;

  public BaseHelper(WebDriver wd) {
    this.wd = wd;
  }

  protected void click(By locator) {
    find(locator).click();
  }

  protected void type(By locator, String text) {
    click(locator);
    wd.findElement(locator).clear();
    wd.findElement(locator).sendKeys(text);
  }

  protected WebElement find(By locator) {
    return wd.findElement(locator);
  }

  protected void select(By locator, String selectedValue) {
    click(locator);
    new Select(find(locator)).selectByVisibleText(selectedValue);
  }

  protected void selectDate(By dayPath, By monthPath, By yearPath, Date date) {
    select(dayPath, date.getDay());
    select(monthPath, date.getMonth());
    type(yearPath, date.getYear());
  }

  private boolean isAlertPresent() {
    try {
      wd.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

}
