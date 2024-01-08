package guru.qa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;


public class OpenSolutionsTest {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
    }
    @Test
    void fillOpenSolutionsTest() {
    open("https://github.com/");
    $(".header-menu-wrapper").$(withText("Solutions")).hover();
    $(".header-menu-wrapper").$(withText("Enterprise")).click();
    $("#hero-section-brand-heading").shouldHave(text("The AI-powered")).shouldBe(visible);
    }

}
