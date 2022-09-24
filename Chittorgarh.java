package week4.day1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chittorgarh {

	public static void main(String[] args) {

WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.chittorgarh.com/");
driver.findElement(By.id("navbtn_stockmarket")).click();
driver.findElement(By.xpath("//a[@title='NSE SME Share Prices Live']/following-sibling::a[1]")).click();
List<String> lst=new ArrayList<String>();
List<WebElement> names = driver.findElements(By.xpath("//table[contains(@class,'table table-bordered')]//tr[\"+i+\"]/td[3]"));		
for (int i = 0; i < names.size(); i++) {
	String text = names.get(i).getText();

	for (int j = 0; j < names.size(); j++) {
			lst.add(text);
		System.out.println(lst);
		break;
	}
	}
Set<String> dupSet=new HashSet<String>(lst);
if(lst.size()!=dupSet.size()) {
	System.out.println("Duplicate is present");
}
else {
	System.out.println("No duplicates");
}
}
}
