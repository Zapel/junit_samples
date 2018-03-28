package ru.stqa.trainings.junit.simple1.sample5;

import org.junit.Test;

public class SeleniumTest extends SeleniumMethodFixture {

  @Test
  public void test1() {
    driver.get("http://seleniumhq.org/");
  }

  @Test
  public void test2() {
    driver.get("http://selenium2.ru/");
  }

}
