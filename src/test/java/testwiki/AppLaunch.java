package testwiki;

import configwiki.ConfigurationWiki;
import org.testng.Assert;
import org.testng.annotations.Test;
import wikiscreens.MainScreen;

public class AppLaunch extends ConfigurationWiki {

    @Test
    public void launch1() {
        String detail = new MainScreen(driver).getDetail();
        Assert.assertEquals(detail, "In the news");
    }
}
