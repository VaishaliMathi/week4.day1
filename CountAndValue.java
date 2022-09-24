package week4.day1;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CountAndValue {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://html.com/tags/table/");
		//row count
		List <WebElement>rowcount = driver.findElements(By.xpath("(//table//tbody)[1]"));
		 System.out.println("The row count is"+rowcount.size());
		 //coulumn count
		 List <WebElement>columncount = driver.findElements(By.xpath("(//table//tr[1]/td)[1]"));
	System.out.println("The column count is "+columncount.size());
	
	//You have to print the respective values based on given Library
	List<WebElement> text=driver.findElements(By.xpath("(//table//tr[2])[1]"));
for (int i = 0; i <text.size(); i++) {
	System.out.println(text.get(i).getText());
}
}
}
