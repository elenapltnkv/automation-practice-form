import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class RegistrationFormTest {
    @BeforeAll
    static void beforeAll(){
        Configuration.browserSize = "1920x1080";
        baseUrl= "https://demoqa.com";
    }
    @Test
    public void registrationForm(){
        open("/automation-practice-form");
        $("#firstName").setValue("Elena");
        $("#lastName").setValue("Samelena");
        $("#userEmail").setValue("samtest@test.ru");
        //$(By.cssSelector("input[id='gender-radio-2']")).click();
        $("#userNumber").setValue("1234567890");
        $("#submit").click();


    }

}
