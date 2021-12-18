package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import starter.cocoads.tasks.NavigateTo;
import starter.cocoads.tasks.SignInN11;
import starter.cocoads.tasks.user_interface.CocoAdsHomePageElements;
import starter.cocoads.tasks.user_interface.n11SignUpPageElements;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.containsText;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class n11SellerOfficeStepDefinitiyons {

    Actor actor = Actor.named("patikabootcampers");
    @Managed
    WebDriver webDriver;

    @Given("user launch browser and open the login page")
    public void user_launch_browser_and_open_the_login_page() {
        actor.can(BrowseTheWeb.with(webDriver));
        actor.wasAbleTo(NavigateTo.then11SellerOfficePage());

    }
    @When("user signed in selleroffice with valid credentials")
    public void user_signed_in_selleroffice_with_valid_credentials() {
        actor.attemptsTo(SignInN11.signInThePage("kaan123","kaan123!",
                "kaan123!","kaan123@gmail.com","kaan123@gmail.com","KAAN"));
    }
    @Then("user signed in selleroffice unsuccessfully")
    public void user_signed_in_selleroffice_unsuccessfully() {


        actor.should(
                GivenWhenThen.seeThat(the(n11SignUpPageElements.ERROR_TEXT)
                        ,containsText("Şifre, kullanıcı adındaki art arda 4 karakteri içeremez."))
        );
    }

    }

