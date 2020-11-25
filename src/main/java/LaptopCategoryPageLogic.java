import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.page;

public class LaptopCategoryPageLogic extends LaptopCategoryPageElement {
    public BuyGoodLogic clickCategory(SelenideElement element) {
    element.shouldBe(Condition.visible).click();
    return page(BuyGoodLogic.class);
    }
}
