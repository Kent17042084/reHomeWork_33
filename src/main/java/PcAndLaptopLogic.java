import com.codeborne.selenide.Condition;
import org.openqa.selenium.JavascriptExecutor;

import static com.codeborne.selenide.Selenide.page;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class PcAndLaptopLogic extends PcAndLaptopElements {
    public LaptopCategoryPageLogic clickOnCategoryJS() {
        laptopAndCompCategory.shouldBe(Condition.visible);
        JavascriptExecutor executor = (JavascriptExecutor) getWebDriver();
        executor.executeScript("arguments[0].click()", laptopAndCompCategory);
        return page(LaptopCategoryPageLogic.class);
    }
}
