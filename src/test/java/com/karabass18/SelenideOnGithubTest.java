package com.karabass18;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SelenideOnGithubTest {
    @BeforeEach
    public void startSet() {

        open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
        // sleep(200);
        $(withText("more pages")).click();

    }

    @Test
    //@Disabled
    public void wikiHasSoftAssertionsTest() {

        $("#wiki-pages-box.wiki-pages-box").shouldHave(text("SoftAssertions"));

    }

    @Test
    //@Disabled
    public void softAssertionHasJunit() {
        //sleep (5000);
        $("#wiki-pages-box.wiki-pages-box").$(byText("SoftAssertions")).click();
        $("#user-content-3-using-junit5-extend-test-class").shouldBe(visible);

    }
}
