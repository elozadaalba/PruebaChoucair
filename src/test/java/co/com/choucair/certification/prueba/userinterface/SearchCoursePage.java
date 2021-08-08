package co.com.choucair.certification.prueba.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {
    public static final Target BUTTON_UNIVERSIDADC =  Target.the("Select the img in  " +
            "choucair page").located(By.xpath("/html/body/div[2]/div[2]/div/div/div/section[1]/div[2]/aside/section" +
            "[1]/div/div/div[1]/center/div/div/div/div[2]/a/img"));
    public static final Target INPUT_COURSE =  Target.the("Search the course " +
            "").located(By.xpath("/html/body/div[1]/div[2]/div/div/div/section/div[2]/form/fieldset/input[1]"));
    public static final Target BUTTON_GO =  Target.the("Button by search the " +
            "course").located(By.xpath("//*[@id=\"coursesearch\"]/fieldset/button"));
    public static final Target SELECT_COURSE =  Target.the("Button by select the" +
            "course ").located(By.xpath("/html/body/div[2]/div[2]/div/div/div/section/div/div/div[2]/h4/a"));
    public static final Target NAME_COURSE =  Target.the("Gets the name of the course" +
            "").located(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/section/div/div[1]/div/div[1]/h3/a"));


}