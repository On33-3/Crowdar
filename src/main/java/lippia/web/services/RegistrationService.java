package lippia.web.services;



import lippia.web.constants.RegistrationConstants;

import org.testng.Assert;

import java.util.UUID;

import static com.crowdar.core.actions.ActionManager.*;

public class RegistrationService {


    public static void putEmailAndPass(String email, String pass) {
        String randomString = UUID.randomUUID().toString().toUpperCase().substring(0, 5);
        email = randomString + "@gmail.com";
        setInput(RegistrationConstants.EMAIL_TEXT_BOX, email);
        setInput(RegistrationConstants.PASS_TEXT_BOX, pass);
    }


    public static void clickOnRegisterButton() {
        click(RegistrationConstants.REGISTER_BUTTON);
    }

    public static void verifyWelcomeMessage() {

        Assert.assertNotNull(RegistrationConstants.WELCOME_MESSAGE);


    }


    public static void putEmailAndPassByVariables(String email, String pass) {
        setInput(RegistrationConstants.EMAIL_TEXT_BOX, email);
        setInput(RegistrationConstants.PASS_TEXT_BOX, pass);

    }

    public static void verifyMessageWarnings(String warning) {
        Assert.assertEquals(warning, getText(RegistrationConstants.WARNING_MESSAGE));


    }
}
