package wikiscreens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;

public class MainScreen extends BaseScreen {

    public MainScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@resource-id='org.wikipedia:id/view_card_header_title']")
    MobileElement detaiView;
    @FindBy(xpath = "//*[@class='android.widget.ImageView']")
    MobileElement serchButton;

    public String getDetail(){
        return detaiView.getText();
    }
    public SearchScreen clickOnSearchFromMainPage() {
        serchButton.click();
        return new SearchScreen(driver);
    }



}
