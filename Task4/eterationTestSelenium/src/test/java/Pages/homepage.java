package Pages;

import Base.BasePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;


import static Constants.Constants.*;

public class homepage extends BasePage {
    public homepage(WebDriver driver) {
        super(driver);
    }

    public homepage goToEteration() {
        goUrl(URL);

        return this;
    }

    public homepage closePopup() {
        click(CLOSE_POP_UP);
        return this;
    }
    public homepage goInstructors() {
        click(BUTTON_INSTRUCTORS);
        return this;
    }
    public homepage arrayCheck()  {
        List<WebElement> links = listElements(ARRAY);
        int number =  links.size();
        Assert.assertEquals(number, 8);

        return this;

    }
}