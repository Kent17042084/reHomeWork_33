import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.page;

public class buyFirstProductLogic extends buyFirstProduct{
    public checkingSum checkingSumLogic(SelenideElement element) {
        element.shouldBe(Condition.visible).click();
        return page(checkingSumLogic.class);

    }

}