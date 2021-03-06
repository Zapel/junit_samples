package ru.stqa.trainings.junit.simple3.sample13;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;

@RunWith(Parameterized.class)
public class ParametersFieldsTest extends SeleniumTestBase {
  
  @Parameters(name = "user:{0}, password:{1}")
  public static Collection<Object[]> users() {
    return Arrays.asList(new Object[][] {
      {"admin", "admin"},
      {"guest", "guest"},
    });
  }
  
  @Parameter(0)
  public String user;
  @Parameter(1)
  public String password;
  
  @Test
  public void testLogin() {
    driver.get("http://localhost/php4dvd/");
    driver.findElement(By.name("username")).sendKeys(user);
    driver.findElement(By.name("password")).sendKeys(password);
    driver.findElement(By.name("submit")).click();
  }
  
  @After
  public void logout() {
    driver.findElement(By.linkText("Log out")).click();
    driver.switchTo().alert().accept();
  }
}
