import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class FormTests {

    @Test
    void TestSelenide(){
        //открыть репозиторий селенида на гитхабе
        open("https://github.com/selenide/selenide");
        //навести мышь на первого учатника проекта
        $(".Layout-sidebar").$(byText("Contributors"))
                .closest(".h4 mb-3").sibling(0).$$("li").first().hover();
        //проверка: в всплывающем окне содержится Andrei Solntsev
        $$(".Popover").findBy(visible).shouldHave(text("Andrei Solntsev"));
        sleep(5000);
    }
    
}

