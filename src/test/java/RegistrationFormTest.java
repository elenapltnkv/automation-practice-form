import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.checked;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class StudentRegistrationForm {
    @BeforeAll
    static void beforeAll(){
        Configuration.baseUrl= "https://demoqa.com";
    }
    @Test
    public void registrationForm(){
        open("/automation-practice-form");
        $("#firstName").setValue("Elena");
        $("#lastName").setValue("Samelena");
        $("#userEmail").setValue("samtest@test.ru");
        //$(".custom-control-input").shouldHave(text("Female"));
        //$(".btn btn-primary").click();

    }

}
