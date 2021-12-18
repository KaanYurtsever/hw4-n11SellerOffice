package starter.cocoads.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;
import starter.cocoads.tasks.user_interface.LoginPageElements;
import starter.cocoads.tasks.user_interface.n11SignUpPageElements;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class SignInN11 implements Task {
    private final String username_text;
    private final String password_text;
    private final String retype_password_text;
    private final String email_text;
    private final String retype_email_text;
    private final String nickname_text;

    @Step("{0} Signin with username '#email_text' and password '#password_text'")
    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(
                Click.on(n11SignUpPageElements.SIGNIN_BOX),
                WaitUntil.the(n11SignUpPageElements.USERNAME_FIELD,isClickable()).forNoMoreThan(2).seconds(),
                Click.on(n11SignUpPageElements.USERNAME_FIELD),
                SendKeys.of(this.username_text).into(n11SignUpPageElements.USERNAME_FIELD),
                Click.on(n11SignUpPageElements.PASSWORD_FIELD),
                SendKeys.of(this.password_text).into(n11SignUpPageElements.PASSWORD_FIELD),
                Click.on(n11SignUpPageElements.RETYPE_PASSWORD_FIELD),
                SendKeys.of(this.retype_password_text).into(n11SignUpPageElements.RETYPE_PASSWORD_FIELD),
                Click.on(n11SignUpPageElements.EMAIL_FIELD),
                SendKeys.of(this.email_text).into(n11SignUpPageElements.EMAIL_FIELD),
                Click.on(n11SignUpPageElements.RETYPE_EMAIL_FIELD),
                SendKeys.of(this.retype_email_text).into(n11SignUpPageElements.RETYPE_EMAIL_FIELD),
                Click.on(n11SignUpPageElements.NICKNAME_FIELD),
                SendKeys.of(this.nickname_text).into(n11SignUpPageElements.NICKNAME_FIELD),
                Click.on(n11SignUpPageElements.SIGNIN_BTN)

        );





    }

    public SignInN11(String username_text, String password_text, String retype_password_text , String email_text,String retype_email_text,String nickname_text){
        this.username_text = username_text;
        this.password_text = password_text;
        this.retype_password_text = retype_password_text;
        this.email_text = email_text;
        this.retype_email_text = retype_email_text;
        this.nickname_text = nickname_text;

    }



    public static SignInN11 signInThePage(String username_text, String password_text, String retype_password_text , String email_text,String retype_email_text,String nickname_text) {
        return instrumented(SignInN11.class
                ,username_text,password_text,retype_password_text,email_text,retype_email_text,nickname_text);
    }
}
