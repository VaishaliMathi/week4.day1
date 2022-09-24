package week4.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToyWithTable {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://testleaf.herokuapp.com/pages/table.html");
	//row count
	List<WebElement> row = driver.findElements(By.xpath("//table//tr[2]//td"));
	System.out.println("The row count is"+row.size());
	//column count
	List<WebElement> column = driver.findElements(By.xpath("//table//tr"));
	System.out.println("The column count is"+column.size());
	//progress value of Learn to interact with Elements
	WebElement value = driver.findElement(By.xpath("//table//tr[3]/td[2]"));
	System.out.println("progress value of Learn to interact with Elements is"+ value.getText());
	//click the vital task for least completed progress
	driver.findElement(By.xpath("//table//tr[4]/td[3]")).click();
	
	
	}

}
