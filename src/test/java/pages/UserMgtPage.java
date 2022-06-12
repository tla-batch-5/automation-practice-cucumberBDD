package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WebDriverManager;

public class UserMgtPage {
    private static UserMgtPage page;
    public UserMgtPage(){
        PageFactory.initElements(WebDriverManager.getDriver(), this);
    }



    public static UserMgtPage getPage(){
        if (page == null){
            page = new UserMgtPage();
        }
        return page;
    }
}