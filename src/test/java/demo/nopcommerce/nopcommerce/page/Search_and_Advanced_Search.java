package demo.nopcommerce.nopcommerce.page;

import demo.nopcommerce.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class Search_and_Advanced_Search extends BasePage {
    String Search = "//input[@class='search-text']";

    public void Advanced_Search01() {
        getWaitDriver().until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Search)));
        waitForElementClickable(By.xpath("//div[@class = 'buttons']/button")).click();
//        clickToButtonWithText("Search");
        sleep(2);
        WebElement element = findElement("//div[@class = 'warning']");
        String getText = element.getText();
        Assert.assertEquals(getText, "Search term minimum length is 3 characters");

    }

    public void Advanced_Search02(String search) {
        getWaitDriver().until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Search)));
        inputTextWithClass("search-text", search);
        waitForElementClickable(By.xpath("//div[@class = 'buttons']/button")).click();
        sleep(2);
        WebElement element = findElement("//div[@class = 'no-result']");
        String getText = element.getText();
        Assert.assertEquals(getText, "No products were found that matched your criteria.");
    }

    public void Advanced_Search03(String search01) {//Tương đối
        getWaitDriver().until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Search)));
        inputTextWithClass("search-text", search01);
        waitForElementClickable(By.xpath("//div[@class = 'buttons']/button")).click();
        sleep(2);
//        WebElement element1 = findElement("//h2[@class = 'product-title']");
//        String getSize = element1.getSize();
//        Assert.assertEquals(getSize, 2);
//        Assert.assertEquals((webDriver, "//h2[@class = 'product-title']"), 2);
        WebElement element = findElement("//span[text() = '$500.00']/parent::div/parent::div//preceding::h2/a");
        String getText = element.getText();
        Assert.assertEquals(getText, "Lenovo IdeaCentre 600 All-in-One PC");
        WebElement element01 = findElement("//span[text() = '$1,360.00']/parent::div/parent::div//preceding-sibling::h2/a");
        String getText01 = element01.getText();
        Assert.assertEquals(getText01, "Lenovo Thinkpad X1 Carbon Laptop");


    }

    public void Advanced_Search04(String search01) {
        getWaitDriver().until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Search)));
        inputTextWithClass("search-text", search01);
        clickToLabelWithText("Advanced search");
        selectItemInDropDown("//select[@name='cid']", "Computers");
        clickToLabelWithText("Automatically search sub categories");
        selectItemInDropDown("//select[@name='mid']", "Apple");
        clickToLabelWithText("Search In product descriptions");
        clickToButtonWithText("Search");
    }

    public void Advanced_Search05(String search02) {
        getWaitDriver().until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Search)));
        inputTextWithClass("search-text", search02);
        clickToLabelWithText("Advanced search");
        selectItemInDropDown("//select[@name='cid']", "Computers");
        waitForElementClickable(By.xpath("//div[@class = 'buttons']/button")).click();
        sleep(2);
        WebElement element = findElement("//div[@class = 'no-result']");
        String getText = element.getText();
        Assert.assertEquals(getText, "No products were found that matched your criteria.");
    }
    public void Advanced_Search06(String search02) {
        getWaitDriver().until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Search)));
        inputTextWithClass("search-text", search02);
        clickToLabelWithText("Advanced search");
        waitForElementClickable(By.xpath("//div[@class = 'buttons']/button")).click();
        sleep(2);
        WebElement element = findElement("//h2[@class = 'product-title']//a");
        String getText = element.getText();
        Assert.assertEquals(getText, "Apple MacBook Pro 13-inch");
    }
}
