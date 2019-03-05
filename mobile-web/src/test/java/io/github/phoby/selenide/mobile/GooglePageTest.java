package io.github.phoby.selenide.mobile;

import org.junit.Test;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class GooglePageTest {
   
   @Test
   public void example() {
      open("https://www.google.com");
      new GooglePage().search("Selenide로 테스트 자동화하기");
      
      $$("#ires .g").shouldHave(sizeGreaterThan(1));
      $$("#ires .g").get(0).shouldHave(text("Selenide로 테스트 자동화 시작하기"));
      
      sleep(1000);
   }
}
