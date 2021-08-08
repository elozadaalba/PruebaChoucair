package co.com.choucair.certification.prueba.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairLoginPage extends PageObject {
    public static final Target LOGIN_BUTTON =  Target.the("Button that show usthe form to " +
            "login").located(By.xpath("//*[@id=\"nav-menu\"]/ul[2]/li/a"));
    public static final Target INPUT_USER =  Target.the("Where do we write the " +
            "user ").located(By.xpath("//*[@id=\"username\"]"));
    public static final Target INPUT_PASSWORD =  Target.the("Where do we write the " +
            "password ").located(By.xpath("//*[@id=\"password\"]"));
    public static final Target ENTER_BUTTON =  Target.the("Button to confirm " +
            "login ").located(By.xpath("//*[@id=\"Ingresar\"]/div/div/div[2]/div[2]/form/div[3]/button"));
}
