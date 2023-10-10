package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.LogInPageConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import static com.crowdar.core.actions.WebActionManager.navigateTo;
import static java.lang.String.valueOf;

public class LogInPageService extends ActionManager {

    public static void enterMyAccountPage(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
        click(LogInPageConstants.MY_ACCOUNT_BUTTON);
    }

    public static void logIn(String email, String pass) {
        setInput(LogInPageConstants.USERNAME_INPUT,email);
        setInput(LogInPageConstants.PASSWORD_INPUT,pass);
        click(LogInPageConstants.LOGIN_BUTTON);
    }

    public static void verifyWarning(String warning){

       Assert.assertEquals(warning, getText(LogInPageConstants.WARNING_ELEMENT));

    }
}
