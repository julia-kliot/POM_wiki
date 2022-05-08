package testwiki;

import configwiki.ConfigurationWiki;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import wikiscreens.MainScreen;
import wikiscreens.SearchScreen;

public class Search1 extends ConfigurationWiki {
 @BeforeMethod
public void precinditions(){
     new MainScreen(driver).clickOnSearchFromMainPage();
 }
 @Test
public void searchTest(){
boolean isLiner= new SearchScreen(driver)
        .fillInText("dog")
        .closeBoard()
        .isLiner();
     Assert.assertTrue(isLiner);
 }
}
