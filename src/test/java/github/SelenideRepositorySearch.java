package github;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.text;

public class SelenideRepositorySearch {


    @Test
    void shouldFindSelenideRepositoryAtTheTop() {
        //открыть главную страницу
        Configuration.holdBrowserOpen = true;
        open("https://github.com/");
        //кликнуть на кнопку поиска
        $("[aria-label='Search or jump to, type / to search']").click();
        //ввести в строку поиска selenid и нажать enter
        $("[placeholder='Search or jump to...']").setValue("selenide").pressEnter();
        //кликнуть на первый репеозиторий из списка найденых
        $$("div.List-module__List__j9yVV div").first().$("a").click();
        //проврека заголовка seleinide/selenide
        $("#repository-container-header").shouldHave(text("selenide / selenide"));


    }
}