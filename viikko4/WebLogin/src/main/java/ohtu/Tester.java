package ohtu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Tester {

    public static void main(String[] args) {

       logIn("pekka","akkep");
       logIn("pekka","väärä"); //login with correct username, wrong password
       logIn("eiole","eiole"); //login with username that doesn't exist
       register("uusi","salasana","salasana");
       registerAndLogOut("kayttaja","salasana");

    }

    private static void sleep(int n){
        try{
            Thread.sleep(n*1000);
        } catch(Exception e){}
    }

    public static void logIn(String username, String password) {
      System.setProperty("webdriver.chrome.driver", "/Users/omistaja/Downloads/chromedriver");
      WebDriver driver = new ChromeDriver();

      driver.get("http://localhost:4567");

      sleep(2);

      WebElement element = driver.findElement(By.linkText("login"));
      element.click();

      sleep(2);

      element = driver.findElement(By.name("username"));
      element.sendKeys(username);
      element = driver.findElement(By.name("password"));
      element.sendKeys(password);
      element = driver.findElement(By.name("login"));

      sleep(2);
      element.submit();

      sleep(3);




      System.out.println(driver.getPageSource());
      driver.quit();
    }

    public static void register(String username, String password, String passwordConfirmation) {
      WebDriver driver = new ChromeDriver();

      driver.get("http://localhost:4567");

      sleep(2);

      WebElement element = driver.findElement(By.linkText("register new user"));
      element.click();

      sleep(2);

        element = driver.findElement(By.name("username"));
        element.sendKeys(username);

        element = driver.findElement(By.name("password"));
        element.sendKeys(password);

        element = driver.findElement(By.name("passwordConfirmation"));
        element.sendKeys(passwordConfirmation);
        sleep(2);
        element.submit();

        System.out.println(driver.getPageSource());
        driver.quit();
    }

    public static void registerAndLogOut(String username,String password) {
      WebDriver driver = new ChromeDriver();

      driver.get("http://localhost:4567");

      sleep(2);

      WebElement element = driver.findElement(By.linkText("register new user"));
      element.click();

      sleep(2);

        element = driver.findElement(By.name("username"));
        element.sendKeys(username);

        element = driver.findElement(By.name("password"));
        element.sendKeys(password);

        element = driver.findElement(By.name("passwordConfirmation"));
        element.sendKeys(password);
        sleep(2);
        element.submit();


        element = driver.findElement(By.linkText("continue to application mainpage"));
        element.click();


        element = driver.findElement(By.linkText("logout"));
        element.click();

        System.out.println(driver.getPageSource());
        driver.quit();
    }


}
