import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BuyGood {

    SelenideElement productTitle = $(By.xpath("//span[@class='goods-tile__title']"));

    SelenideElement goodBuyButton = $(By.xpath("//button[@class='buy-button goods-tile__buy-button']"));

    SelenideElement counter = $(By.xpath("//span[@class='header-actions__button-counter']"));

    SelenideElement cartProductTitle = $(By.xpath("//a[@class='cart-product__title']"));

}
