import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;

import static com.codeborne.selenide.Condition.text;

public class BuyGoodLogic extends BuyGood {
    public BuyGoodLogic clickCategory(SelenideElement element) {
        element.shouldBe(Condition.visible).click();
        String productTitleText = productTitle.text();
        counter.shouldHave(text("1")).click();
        String cartProductTitleText = cartProductTitle.text();
        Assert.assertEquals(productTitleText, cartProductTitleText);

        return this;
    }
}
