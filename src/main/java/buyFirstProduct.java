import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$$;

public class buyFirstProduct {
    ElementsCollection titles = $$(By.xpath("buy-button goods-tile__buy-button']"));
}
