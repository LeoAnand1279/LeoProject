package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class DrpDown {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SysSoft\\eclipse-workspace\\DropDown\\driver\\chromedriver.exe");
	WebDriver a=new ChromeDriver();
	a.get("https://foodlicensing.fssai.gov.in/PreCheck/PreCheckUnitDetails.aspx");
	WebElement b=a.findElement(By.xpath("//img[@alt='New food buisness operator']"));
	b.click();
	WebElement s=a.findElement(By.xpath("//textarea[@id='gvPreCheck_ctl03_txtAddress']"));
    s.sendKeys("gfytrytdyglktukiykug");
    WebElement k=a.findElement(By.name("gvPreCheck$ctl03$ddlState"));
    k.click();
    Select d=new Select(k);
    d.deselectByIndex(10);
    a.quit();
}
}
