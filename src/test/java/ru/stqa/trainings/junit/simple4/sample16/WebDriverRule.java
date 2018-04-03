package ru.stqa.trainings.junit.simple4.sample16;

import org.junit.rules.ExternalResource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverRule extends ExternalResource {
  private WebDriver driver;

  @Override
  protected void before() throws Throwable {
    System.out.println("Starting a browser");
    driver = new ChromeDriver();
  }

  @Override
  protected void after() {
    System.out.println("Stopping the browser");
    if (driver != null) {
      driver.quit();
    }
  }
}
