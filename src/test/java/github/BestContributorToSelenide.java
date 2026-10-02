package github;


import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import com.codeborne.selenide.Selectors;

import static com.codeborne.selenide.Condition.text;

import static com.codeborne.selenide.Selenide.*;


public class BestContributorToSelenide {
    @Test
    void solntsevShoulBeTheTopContributor() {
        Configuration.holdBrowserOpen = true;
        // открыть страницу репозитория selenide
        open("https://github.com/selenide/selenide");
        //подвести мышку к первому аватару из блока contributes
        $(".prc-PageLayout-Pane-AyzHK").$(Selectors.byText("Contributors")).ancestor(".SidebarSection-module__sidebarSection__e8jFN")
                .$$("ul li").get(2).hover();
        //проверка всплывающего текста Aleksei Vinogradoff
        $(".Popover").shouldHave(text("Alexei Vinogradov"));

    }
}
