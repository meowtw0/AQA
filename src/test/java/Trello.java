import com.codeborne.selenide.Selenide;
import static com.codeborne.selenide.Selectors.byClassName;
import io.qameta.allure.Step;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selenide.$;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;


public class Trello {

    @Step("Login")
    @Test
    public static void Login() {
        Selenide.open("https://trello.com/");
        Selenide.$x("//a[contains(text(),\"Log in\")]").click();
        Selenide.$x("//input[@type=\"email\"]").setValue("ykonevych@gmail.com");
        Selenide.$("button[id=login-submit]").click();
        Selenide.$x("//input[@type=\"password\"]").setValue("Password!123QA");
        Selenide.$("button[id=login-submit]").click();
    }
    @Step("Add Cart")
    @Test
    public static void addCart() {
        Selenide.$("div[title=\"Homework\"]").click();
        Selenide.$(byClassName("O9vivwyDxMqo3q")).click();
        Selenide.$(by("data-testid", "list-card-composer-textarea")).setValue("Test card").pressEnter();
    }
    @Step("Move Cart")
    @Test
    public static void moveCart() {
        SelenideElement card = $("a[class='NdQKKfeqJDDdX3']");
        SelenideElement doneList = $("textarea[aria-label='Done']");
        actions().clickAndHold(card).moveToElement(doneList).release().build().perform();

    }
    @Step("Delete Cart")
    @Test
    public static void deleteCart() {
        Selenide.$("a[class='NdQKKfeqJDDdX3']").contextClick();
        Selenide.$("button[class='BppQGb2j7TfyB5 bxgKMAm3lq5BpA SEj5vUdI3VvxDc']").click();
    }
}
