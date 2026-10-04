package github;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import com.codeborne.selenide.Selectors;


import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;

public class Homework {
    @Test
    void homeShoulBeTheTopContributor(){
        Configuration.holdBrowserOpen = true;
        // открыть страницу репозитория selenide
        open("https://github.com/selenide/selenide");
        //открыть станицу Wiki и кликнуть
        $("#wiki-tab").click();
        //Убедимся, что в списке страниц (Pages) есть страница SoftAssertions
        $(".Link--muted.js-wiki-more-pages-link.btn-link.mx-auto.tmp-mx-auto.f6").click();
        //Проверим появилась ли страница SoftAssertion и открыаем
        $(".wiki-rightbar").$(byText("SoftAssertions")).click();
        //Проверяем что внутри есть пример кода для JUnit5
        $(".markdown-body").shouldHave(text("Using JUnit5 extend test class:"));


    }
}