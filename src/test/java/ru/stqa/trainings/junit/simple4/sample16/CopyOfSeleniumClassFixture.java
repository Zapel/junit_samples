package ru.stqa.trainings.junit.simple4.sample16;

import org.junit.ClassRule;
import org.junit.rules.ExternalResource;
import org.openqa.selenium.WebDriver;

public class CopyOfSeleniumClassFixture {

  protected static WebDriver driver;

  @ClassRule
  public static ExternalResource driverRule = new WebDriverRule();
}
