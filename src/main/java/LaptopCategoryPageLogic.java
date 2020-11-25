import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.page;

public class LaptopCategoryPageLogic extends LaptopCategoryPageElement {
    public BuyGoodLogic clickCategory() {
        laptopCategory.click();
    return page(BuyGoodLogic.class);
    }
}
