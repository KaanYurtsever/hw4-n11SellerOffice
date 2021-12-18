package starter.cocoads.tasks.user_interface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class n11SignUpPageElements {
    public static Target SIGNIN_BOX = Target.the("sign in box").locatedBy(("#registerNow"));
    public static Target USERNAME_FIELD = Target.the("username textbox").locatedBy(("#usernameInputText"));
    public static Target PASSWORD_FIELD = Target.the("pass textbox").locatedBy(("#passwordInputText"));
    public static Target RETYPE_PASSWORD_FIELD = Target.the("retype pass textbox").locatedBy(("#passwordRetypeInputText"));
    public static Target EMAIL_FIELD = Target.the("email textbox").locatedBy(("#emailInputText"));
    public static Target RETYPE_EMAIL_FIELD = Target.the("retype mail textbox").locatedBy(("#emailRetypeInputText"));
    public static Target NICKNAME_FIELD = Target.the("nickname textbox").locatedBy(("#nicknameInputText"));
    public static Target SIGNIN_BTN = Target.the("signin btn").locatedBy("#j_id275_j_id_dk");
    public static Target ERROR_TEXT = Target.the("error text").locatedBy(".ui-message-error-detail");
}
