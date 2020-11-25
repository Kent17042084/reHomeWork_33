import org.openqa.selenium.JavascriptExecutor;

import static com.codeborne.selenide.Selenide.page;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class PcAndLaptopLogic extends PcAndLaptopElements {
    public LaptopCategoryPageLogic clickOnCategoryJS() {

        JavascriptExecutor executor = (JavascriptExecutor) getWebDriver();
        executor.executeScript("arguments[0].click()", laptopAndCompCategory);
        return page(LaptopCategoryPageLogic.class);
    }
}
