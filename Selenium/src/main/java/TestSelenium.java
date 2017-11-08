import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium
{
    public static void main(String[] args)
    {
        PassTest();
        FailTest();
    }

    public static void PassTest()
    {
        // Telling the system where to find the Chrome driver
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();

        // get the web page
        webDriver.navigate().to("http://www.youtube.com");

        //pause for 5 seconds
        sleep(5000);

        //gets the search box
        WebElement searchBox = webDriver.findElement(By.name("search_query"));

        //enters the characters into the search box
        searchBox.sendKeys("java");

        //gets the enter button
        WebElement enter = webDriver.findElement(By.id("search-icon-legacy"));
        enter.click();

        //pause for 5 seconds
        sleep(5000);

        webDriver.close();
        webDriver.quit();
    }

    public static void FailTest()
    {
        // Telling the system where to find the Chrome driver
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();

        //gets the web page
        webDriver.get("https://login.yahoo.com/?.src=ym&.intl=us&.done=https%3A%2F%2Fmail.yahoo.com%2F");

        //gets the login box
        WebElement element=webDriver.findElement(By.name("username"));

        //enters the characters into the login box
        element.sendKeys("abc@yahoo.com");

        //gets the enter button
        WebElement enter =webDriver.findElement(By.name("signin"));
        enter.click();

        //pause for 5 seconds
        sleep(5000);

        webDriver.close();
        webDriver.quit();
    }

    private static void sleep(int milliseconds)
    {
        try
        {
            Thread.sleep(milliseconds);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }

}

