package pastebin;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Instant;
import java.util.List;

import static java.util.concurrent.CompletableFuture.anyOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertTrue;

public class HelloFromWebDriver {
    @Test
    public void BrinItOn () throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://pastebin.com");
        driver.manage().window().maximize();
        WebElement searchInput = driver.findElement(By.id("postform-text"));
        String code = "git config --global user.name  \"New Sheriff in Town\"\n" +
                "git reset $(git commit-tree HEAD^{tree} -m \"Legacy code\")\n" +
                "git push origin master --force";
        searchInput.sendKeys(code);
        WebElement ClickRolSyntaxHighlighting = driver.findElement(By.xpath("//*[@id=\"w0\"]/div[5]/div[1]/div[1]/div/span/span[1]/span/span[2]"));
        ClickRolSyntaxHighlighting.click();
        //Thread.sleep(300);
        WebElement PasteSyntaxHighlighting = driver.findElement(By.xpath("//*[@id=\"select2-postform-format-results\"]/li[2]/ul"));
        List<WebElement> countriesList0 = PasteSyntaxHighlighting.findElements(By.tagName("li"));
        String SyntaxHighlighting = null;
        for (WebElement li : countriesList0) {
            new WebDriverWait(driver, 15);
            SyntaxHighlighting = "Bash";
            if (li.getText().equals(SyntaxHighlighting)) {
                li.click();
                break;
            }
        }
        Thread.sleep(300);
        WebElement ClickRolPasteExpiration = driver.findElement(By.xpath("//*[@id=\"w0\"]/div[5]/div[1]/div[2]/div/span/span[1]/span/span[2]"));
        ClickRolPasteExpiration.click();
        WebElement ClickPasteExpiration = driver.findElement(By.xpath("//*[@id=\"select2-postform-expiration-results\"]"));
        List<WebElement> countriesList1 = ClickPasteExpiration.findElements(By.tagName("li"));
        for (WebElement li : countriesList1) {
            new WebDriverWait(driver, 15);
            if (li.getText().equals("10 Minutes")) {
                li.click();
                break;
            }
        }
        Thread.sleep(300);
        WebElement PasteNameTitle = driver.findElement(By.id("postform-name"));
        String PastName = "how to gain dominance among developers";
         PasteNameTitle.sendKeys(PastName);
        driver.findElement(By.xpath("//*[@id=\"w0\"]/div[5]/div[1]/div[8]/button")).click();
        Thread.sleep(300);
        String actualCode= driver.findElement(By.className("post-view")).getText();
        assertTrue(actualCode.contains(code) && actualCode.contains(PastName));

//           String actualPasteName = driver.findElement(By.className("post-view")).getText();
//        assertTrue(actualPasteName.contains(PastName));
//        String actualSyntaks = driver.findElement(By.className("post-view")).getText();
//        assertTrue(actualSyntaks.contains(SyntaxHighlighting));


        //driver.quit();
    }
}
