import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class FormTests {

    @Test
    void TestSelenide(){
        open("https://github.com/selenide/selenide");
        $(".Layout-sidebar").$(byText("Contributors"))
                .closest(".h4 mb-3").sibling(0).$$("li").first().hover();
        sleep(5000);
    }
    
}

