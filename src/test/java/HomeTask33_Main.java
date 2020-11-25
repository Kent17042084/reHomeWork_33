import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class HomeTask33_Main {
    /*
    Открыть https://rozetka.com.ua/
    Перейти в раздел «Компьютеры и ноутбуки»
    Перейти в раздел « Ноутбуки»
    Добавить первый товар в корзину
    Проверить что в корзину добавился один товар
    Перейти в корзину и проверить, что добавился правильный товар


    @BeforeMethod
    public void before(){
        Configuration.startMaximized = true;
        open("https://rozetka.com.ua");
    }

    @Test
    public void testSelenide(){
        SelenideElement category = $(By.xpath("//a[@class='menu-categories__link']"));

        JavascriptExecutor jse;
        jse = (JavascriptExecutor)getWebDriver();
        jse.executeScript("arguments[0].click();", category);

        SelenideElement laptopCategory = $(By.xpath("//li[@class='portal-grid__cell']//a[contains(text(), 'Ноутбуки')]"));
        laptopCategory.click();


        SelenideElement productTitle = &(By.xpath("//span[@class'goods-tile__title']"));
        String productTitleText = productTitle.text();

        SelenideElement buyBtn = $(By.xpath("//button[@class='buy-button goods-tile__buy-button']"));
        buyBtn.click();

       ..
        SelenideElement counter = $(By.xpath("//span[@class='header-actions__button-counter']"));
        counter.shouldHave(text("1")).click();

        SelenideElement cartProductTitle = $(By.xpath("//a[@class='cart-product__title']"));
        String cartProductTitleText = cartProductTitle.text();

        Assert.assertEquals(ProductTitleText, cartProductTitleText);
    }
*/
    @BeforeMethod
    public void before() {
        Configuration.startMaximized = true;
        Configuration.timeout = 5000;
        //Configuration.holdBrowserOpen = true;
        open("https://rozetka.com.ua");
    }
    @Test
    public void testSelenide() {
        new PcAndLaptopLogic().clickOnCategoryJS();
        new LaptopCategoryPageLogic().clickCategory();
        new BuyGoodLogic().clickCategory();

    }
}
