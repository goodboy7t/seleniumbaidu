package one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class aa {


	static WebDriver driver;
	static String url;
@BeforeClass
public void qt() {
	System.setProperty("webdriver.chrome.driver", "./Tools/chromedriver.exe");
	driver=new ChromeDriver();
	url="http://flight.qunar.com";
}
@Test
public void a() {
	driver.get(url);
	driver.findElement(By.className("inp_chk js-searchtype-oneway")).click();
	driver.findElement(By.xpath("//*[@id=\"dfsForm\"]/div[2]/div[1]/div/input")).sendKeys("ÄÏ²ý");
	driver.findElement(By.xpath("//*[@id=\"dfsForm\"]/div[2]/div[2]/div/div[1]/div[1]")).sendKeys("±±¾©");
	driver.findElement(By.xpath("//*[@id=\"fromDate\"]")).sendKeys("2019-02-10");
	driver.findElement(By.className("btn_search")).click();
}
@Test
public void b() throws InterruptedException {
	Thread.sleep(60000);
	driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[3]/div[4]/div/div/div[1]/div[1]")).click();
}
@AfterClass
public void tuichu() {
	driver.close();
}
}
