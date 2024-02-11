import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static com.codeborne.selenide.Selenide.$;


public class GoogleTranslator {

    @Step("ukr2eng")
    @Test
    public static void Ukraine2Eng() {

        Selenide.open("https://translate.google.com/?sl=uk&tl=en&text=%D0%AF%20%D0%BA%D1%80%D1%83%D1%82%D0%BE%20%D0%B2%D0%B8%D0%B2%D1%87%D1%83%20TestNG&op=translate");
        Selenide.$("button[jsname='b3VHJd']").click(); //підтвердження кукі
        String expected = "I will study TESTNG cool";
        String actual = $(By.cssSelector("span[jsname='W297wb']")).text();
        assertEquals(actual, expected, "Translation doesn't match the expected result");
        }

    @Step("ukr2fr")
    @Test
    public static void Ukraine2FR() {

        Selenide.open("https://translate.google.com/?sl=uk&tl=fr&text=%D0%AF%20%D0%BA%D1%80%D1%83%D1%82%D0%BE%20%D0%B2%D0%B8%D0%B2%D1%87%D1%83%20TestNG&op=translate");
        String expected = "J'étudierai le test.";
        String actual = $(By.cssSelector("span[jsname='W297wb']")).text();
        assertEquals(actual, expected, "Translation doesn't match the expected result");
    }

    @Step("ukr2spanish")
    @Test
    public static void Ukraine2Spanish() {

        Selenide.open("https://translate.google.com/?sl=uk&tl=es&text=%D0%AF%20%D0%BA%D1%80%D1%83%D1%82%D0%BE%20%D0%B2%D0%B8%D0%B2%D1%87%D1%83%20TestNG&op=translate");
        String expected = "Estudiaré testng genial";
        String actual = $(By.cssSelector("span[jsname='W297wb']")).text();
        assertEquals(actual, expected, "Translation doesn't match the expected result");
    }

    @Step("ukr2czech")
    @Test
    public static void Ukraine2Czech() {

        Selenide.open("https://translate.google.com/?sl=uk&tl=cs&text=%D0%AF%20%D0%BA%D1%80%D1%83%D1%82%D0%BE%20%D0%B2%D0%B8%D0%B2%D1%87%D1%83%20TestNG&op=translate");
        String expected = "Budu studovat testng cool";
        String actual = $(By.cssSelector("span[jsname='W297wb']")).text();
        assertEquals(actual, expected, "Translation doesn't match the expected result");
    }

    @Step("ukr2italian")
    @Test
    public static void Ukraine2Italian() {

        Selenide.open("https://translate.google.com/?sl=uk&tl=it&text=%D0%AF%20%D0%BA%D1%80%D1%83%D1%82%D0%BE%20%D0%B2%D0%B8%D0%B2%D1%87%D1%83%20TestNG&op=translate");
        String expected = "Studierò Testng Cool";
        String actual = $(By.cssSelector("span[jsname='W297wb']")).text();
        assertEquals(actual, expected, "Translation doesn't match the expected result");
    }

    @Step("ukr2portuguese")
    @Test
    public static void Ukraine2Portuguese() {

        Selenide.open("https://translate.google.com/?sl=uk&tl=pt&text=%D0%AF%20%D0%BA%D1%80%D1%83%D1%82%D0%BE%20%D0%B2%D0%B8%D0%B2%D1%87%D1%83%20TestNG&op=translate");
        String expected = "Vou estudar testng legal";
        String actual = $(By.cssSelector("span[jsname='W297wb']")).text();
        assertEquals(actual, expected, "Translation doesn't match the expected result");
    }

    @Step("ukr2polish")
    @Test
    public static void Ukraine2Polish() {

        Selenide.open("https://translate.google.com/?sl=uk&tl=pl&text=%D0%AF%20%D0%BA%D1%80%D1%83%D1%82%D0%BE%20%D0%B2%D0%B8%D0%B2%D1%87%D1%83%20TestNG&op=translate");
        String expected = "Badam testng fajny";
        String actual = $(By.cssSelector("span[jsname='W297wb']")).text();
        assertEquals(actual, expected, "Translation doesn't match the expected result");
    }

    @Step("ukr2romain")
    @Test
    public static void Ukraine2Romanian() {

        Selenide.open("https://translate.google.com/?sl=uk&tl=ro&text=%D0%AF%20%D0%BA%D1%80%D1%83%D1%82%D0%BE%20%D0%B2%D0%B8%D0%B2%D1%87%D1%83%20TestNG&op=translate");
        String expected = "Voi studia testng cool";
        String actual = $(By.cssSelector("span[jsname='W297wb']")).text();
        assertEquals(actual, expected, "Translation doesn't match the expected result");
    }

    @Step("ukr2danish")
    @Test
    public static void Ukraine2Danish() {

        Selenide.open("https://translate.google.com/?sl=uk&tl=da&text=%D0%AF%20%D0%BA%D1%80%D1%83%D1%82%D0%BE%20%D0%B2%D0%B8%D0%B2%D1%87%D1%83%20TestNG&op=translate");
        String expected = "Jeg vil studere testng cool";
        String actual = $(By.cssSelector("span[jsname='W297wb']")).text();
        assertEquals(actual, expected, "Translation doesn't match the expected result");
    }

    @Step("ukr2hungarian")
    @Test
    public static void Ukraine2Hungarian() {

        Selenide.open("https://translate.google.com/?sl=uk&tl=hu&text=%D0%AF%20%D0%BA%D1%80%D1%83%D1%82%D0%BE%20%D0%B2%D0%B8%D0%B2%D1%87%D1%83%20TestNG&op=translate");
        String expected = "Tanulni fogom a tesztng cool -ot";
        String actual = $(By.cssSelector("span[jsname='W297wb']")).text();
        assertEquals(actual, expected, "Translation doesn't match the expected result");
    }

    @Step("ukr2german")
    @Test
    public static void Ukraine2German() {

        Selenide.open("https://translate.google.com/?sl=uk&tl=de&text=%D0%AF%20%D0%BA%D1%80%D1%83%D1%82%D0%BE%20%D0%B2%D0%B8%D0%B2%D1%87%D1%83%20TestNG&op=translate");
        String expected = "Ich werde testng cool studieren";
        String actual = $(By.cssSelector("span[jsname='W297wb']")).text();
        assertEquals(actual, expected, "Translation doesn't match the expected result");
    }

    @Step("ukr2turkish")
    @Test
    public static void Ukraine2Turkish() {

        Selenide.open("https://translate.google.com/?sl=uk&tl=tr&text=%D0%AF%20%D0%BA%D1%80%D1%83%D1%82%D0%BE%20%D0%B2%D0%B8%D0%B2%D1%87%D1%83%20TestNG&op=translate");
        String expected = "Testng serin çalışacağım";
        String actual = $(By.cssSelector("span[jsname='W297wb']")).text();
        assertEquals(actual, expected, "Translation doesn't match the expected result");
    }

    @Step("ukr2greek")
    @Test
    public static void Ukraine2Greek() {

        Selenide.open("https://translate.google.com/?sl=uk&tl=el&text=%D0%AF%20%D0%BA%D1%80%D1%83%D1%82%D0%BE%20%D0%B2%D0%B8%D0%B2%D1%87%D1%83%20TestNG&op=translate");
        String expected = "Θα μελετήσω το testng cool";
        String actual = $(By.cssSelector("span[jsname='W297wb']")).text();
        assertEquals(actual, expected, "Translation doesn't match the expected result");
    }

    @Step("ukr2croatian")
    @Test
    public static void Ukraine2Croatian() {

        Selenide.open("https://translate.google.com/?sl=uk&tl=hr&text=%D0%AF%20%D0%BA%D1%80%D1%83%D1%82%D0%BE%20%D0%B2%D0%B8%D0%B2%D1%87%D1%83%20TestNG&op=translate");
        String expected = "Proučit ću testng cool";
        String actual = $(By.cssSelector("span[jsname='W297wb']")).text();
        assertEquals(actual, expected, "Translation doesn't match the expected result");
    }

    @Step("ukr2estonian")
    @Test
    public static void Ukraine2Estonian() {

        Selenide.open("https://translate.google.com/?sl=uk&tl=et&text=%D0%AF%20%D0%BA%D1%80%D1%83%D1%82%D0%BE%20%D0%B2%D0%B8%D0%B2%D1%87%D1%83%20TestNG&op=translate");
        String expected = "Uurin testi jahedat";
        String actual = $(By.cssSelector("span[jsname='W297wb']")).text();
        assertEquals(actual, expected, "Translation doesn't match the expected result");
    }

    @Step("ukr2irish")
    @Test
    public static void Ukraine2Irish() {

        Selenide.open("https://translate.google.com/?sl=uk&tl=ga&text=%D0%AF%20%D0%BA%D1%80%D1%83%D1%82%D0%BE%20%D0%B2%D0%B8%D0%B2%D1%87%D1%83%20TestNG&op=translate");
        String expected = "Déanfaidh mé staidéar ar Testng Cool";
        String actual = $(By.cssSelector("span[jsname='W297wb']")).text();
        assertEquals(actual, expected, "Translation doesn't match the expected result");
    }

    @Step("ukr2swedish")
    @Test
    public static void Ukraine2Swedish() {

        Selenide.open("https://translate.google.com/?sl=uk&tl=sv&text=%D0%AF%20%D0%BA%D1%80%D1%83%D1%82%D0%BE%20%D0%B2%D0%B8%D0%B2%D1%87%D1%83%20TestNG&op=translate");
        String expected = "Jag kommer att studera testng cool";
        String actual = $(By.cssSelector("span[jsname='W297wb']")).text();
        assertEquals(actual, expected, "Translation doesn't match the expected result");
    }

    @Step("ukr2slovak")
    @Test
    public static void Ukraine2Slovak() {

        Selenide.open("https://translate.google.com/?sl=uk&tl=sk&text=%D0%AF%20%D0%BA%D1%80%D1%83%D1%82%D0%BE%20%D0%B2%D0%B8%D0%B2%D1%87%D1%83%20TestNG&op=translate");
        String expected = "Budem študovať testng cool";
        String actual = $(By.cssSelector("span[jsname='W297wb']")).text();
        assertEquals(actual, expected, "Translation doesn't match the expected result");
    }

    @Step("ukr2norwegian")
    @Test
    public static void Ukraine2Norwegian() {

        Selenide.open("https://translate.google.com/?sl=uk&tl=no&text=%D0%AF%20%D0%BA%D1%80%D1%83%D1%82%D0%BE%20%D0%B2%D0%B8%D0%B2%D1%87%D1%83%20TestNG&op=translate");
        String expected = "Jeg vil studere testng kult";
        String actual = $(By.cssSelector("span[jsname='W297wb']")).text();
        assertEquals(actual, expected, "Translation doesn't match the expected result");
    }

    @Step("ukr2bulgianian")
    @Test
    public static void Ukraine2Bulgarian() {

        Selenide.open("https://translate.google.com/?sl=uk&tl=bg&text=%D0%AF%20%D0%BA%D1%80%D1%83%D1%82%D0%BE%20%D0%B2%D0%B8%D0%B2%D1%87%D1%83%20TestNG&op=translate");
        String expected = "Ще проуча тестова готина";
        String actual = $(By.cssSelector("span[jsname='W297wb']")).text();
        assertEquals(actual, expected, "Translation doesn't match the expected result");
    }
}

