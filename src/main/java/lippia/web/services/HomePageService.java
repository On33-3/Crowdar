package lippia.web.services;


import com.crowdar.core.PropertyManager;
import lippia.web.constants.HomePageConstants;
import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.HomePageConstants;
import org.testng.Assert;
import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class HomePageService extends ActionManager {
    public static void goToHomePage() {
        navigateTo(PropertyManager.getProperty("web.base.url"));

    }

    public static void clickShopMenuButton() {
        click(HomePageConstants.SHOP_MENU_BUTTON);

    }

    public static void clicksAnArrivalPicture() {
        click(HomePageConstants.IMAGE_ARRIVAL);
    }

    public static void clickHomeButton() {
        click(HomePageConstants.HOME_BUTTON);
    }

    public static void verifyAddToBasketButton() {
        Assert.assertNotNull(HomePageConstants.ADD_TO_BASKET_BUTTON);
    }

    public static void clicksOnDescriptionTab() {
        click(HomePageConstants.DESCRIPTION_BUTTON);
    }

    public static void clicksOnReviewTab() {
        click(HomePageConstants.REVIEW_BUTTON);
    }

    public static void verifyDescriptionTab() {
        Assert.assertNotNull(HomePageConstants.TAB_DESCRIPTION);
    }

    public static void verifyReviewTab() {
        Assert.assertNotNull(HomePageConstants.TAB_REVIEW);
    }

}
