package SeleniumAutomation;

import static SeleniumAutomation.CommonFunctions.CLICK;
import static SeleniumAutomation.CommonFunctions.Getlocator;
import static SeleniumAutomation.CommonFunctions.INVISIBLEOFLOAD;
import static SeleniumAutomation.CommonFunctions.SELECTFRAME;
import static SeleniumAutomation.CommonFunctions.WAITFORELEMENT;
import static SeleniumAutomation.CommonFunctions.INVISIBLEOFLOAD;
import static SeleniumAutomation.CommonFunctions.WAITTIME;
import static SeleniumAutomation.CommonFunctions.driver;
import static SeleniumAutomation.CommonFunctions.ds;
import static SeleniumAutomation.CommonFunctions.splitfunction;
import SeleniumAutomation.DriverScript.ActionTypes;
import java.awt.AWTException;
import java.io.IOException;
import java.sql.SQLException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author mpentakota
 */
public interface BusinessFunctions {

    public static void main(String[] args) {

    }

    public static boolean OPENCREW() throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException  {
        String Crewpath = "id:=dropbtn_1357";
        String Newpath = "xpath:=//*[@id=\"btn-new\"]";
        String CrewDetails = "xpath:=//*[@id=\"multi-open-accordion\"]/h3[2]/a";
        WebElement Crew = Getlocator(driver, Crewpath);
        Crew.click();
        boolean status = true;
        Crew.click();
        WAITTIME("waittime->10");
        Crew.click();
        WAITTIME("waittime->10");
        Crew.click();
        WAITTIME("waittime->10");
        Crew.click();
        WAITTIME("waittime->10");
        driver.switchTo().frame(0);
        WebElement New = Getlocator(driver, "xpath:=//*[@id=\"btn-new\"]");
        New.click();
        ReportFunctions.LogRepoter("pass", "wait for the element", "element found NEW and clicked on it");
        return false;
    }

    public static boolean OpenAngularpage() throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException  {
        boolean status = true;
        int count = 0;
        boolean flag = false;
        try {
            do {
                WAITTIME("waittime->30");
                driver.switchTo().defaultContent();
                driver.switchTo().frame(0);
             // WebElement locator = Getlocator(driver, "xpath:=//input[@type=\"search\"]");
             WebElement locator = Getlocator(driver, "xpath:=//input [(@id=\"searchtext\") or (@type=\"search\")]");
                if (locator != null) {
                    WebElement New = Getlocator(driver, "xpath:=//*[@id=\"btn-new\"]");
                    New.click();
                    //ReportFunctions.LogRepoter("Pass", "Wait for angular js page", "Sucessfully angular js page loaded");
                    WAITTIME("waittime->4");
                    flag = true;
                    count = 11;
                    status = true;
                    return status;
                } else {
                    count = count + 1;
                }
            } while (count < 10);
            if (flag == false) {
                ReportFunctions.LogRepoter("Fail", "Wait for angular js page", "Failed to load angular js page");
            }
        } catch (org.openqa.selenium.StaleElementReferenceException ex) {

        }
        return status;
    }
    
    
}
