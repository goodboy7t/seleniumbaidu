package one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class xueshengkaoshixitong {
	static WebDriver driver;
	static String url;
@BeforeClass
public void a1() {
	System.setProperty("webdriver.chrome.driver", "./Tools/chromedriver.exe");
	driver=new ChromeDriver();
	url="http://localhost:8080/examsys/login.thtml";
}
@Test
public void a2() throws InterruptedException {
	//打开网页
	driver.get(url);
	//输入用户名
	driver.findElement(By.name("username")).sendKeys("hujianming");
	//输入密码
	driver.findElement(By.name("userpass")).sendKeys("hujianming123");
	//选择类别
WebElement s=driver.findElement(By.name("usertype"));
Select s1=new Select(s);
s1.selectByVisibleText("管理员");
//等待十秒，输入验证码
Thread.sleep(10000);
//点击登录
driver.findElement(By.xpath("/html/body/div/div/table/tbody/tr[5]/td/div/button[1]")).click();
}
@Test
public void a3() throws InterruptedException {
	//等待1秒
	Thread.sleep(1000);
	
	//进入框架
	driver.switchTo().frame("main");
	//获取首页文字
	String shouye=driver.findElement(By.xpath("/html/body/div/div[1]/ul")).getText();
	//打印
	System.out.println(shouye);
}
@AfterClass   //关闭
public void a4() {
	driver.quit();
}
}