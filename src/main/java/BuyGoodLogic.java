import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

public class BuyGoodLogic extends BuyGood {
    public BuyGoodLogic clickCategory(SelenideElement element) {
        element.shouldBe(Condition.visible).click();
        return this;
    }
}
