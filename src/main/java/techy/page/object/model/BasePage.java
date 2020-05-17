package techy.page.object.model;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    private WebDriver driver;
    private WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    protected WebDriver getDriver(){
        return this.driver;

    }
    //This method clicks on elements
    public void clickOnElement (WebElement element) throws InterruptedException {

        Thread.sleep(2000);
        element.click();

    }

    //This method types a String a textBox

    public void typeOnTextBox (WebElement element, String textToBeEntered) {
        drawBorder(element);
        element.sendKeys(textToBeEntered);

    }

    //This method is for checking a checkbox

    public void clickOnCheckbox (WebElement element){
        drawBorder(element);
        element.click();
    }



    //This method for Style border
    public void drawBorder(WebElement element){
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].style.border='3px solid red'", element);
    }


}
