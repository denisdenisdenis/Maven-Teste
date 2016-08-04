package TestCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static io.github.seleniumquery.SeleniumQuery.$;

public class teste {
	public static WebDriver driver;
	public static WebDriver driverJS;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/ChromeDriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://10.221.230.175:9780/CCenterWeb/Login.dm?method=abrirLogin");
		
		
		WebElement login = driver.findElement(By.name("login"));
		login.sendKeys("adm");
		WebElement senha = driver.findElement(By.name("realSenha"));
		senha.sendKeys("123");
		
		WebElement btn = driver.findElement(By.id("msgBotao_login"));
		btn.click();
		
		
	//	driver.findElement(By.name(el.getNameElement();
		
		
		WebElement frm = driver.findElement(By.name("framePortal"));
		driver.switchTo().frame(frm);
		
		
		//driver.switchTo().defaultContent();
		WebElement canais =     driver.findElement(By.xpath("//*[@id='itemmenu_home_1_1']"));
		
		
		
		
		
		
		canais.click();
		//*[@id="itemmenu_home_1_1"]
	   
				
				
	//	WebElement canais = driver.findElement(By.xpath("table[@id='itemmenu_home_1_1']/tbody/tr/td[2]"));
					
				
//			int index = 0;
//			WebElement baseTable = driver.findElement(By.id("table portal"));
//			List<WebElement> tableRows = baseTable.findElements(By.tagName("tr"));
//			tableRows.get(index).getText();
//	
			
			
	  //
			
			//WebElement canais = driver.findElement(By.xpath("table[@id='itemmenu_home_1_1']/tbody/tr/td[2]")).click();
			//WebElement canais2 = driver.findElement(By.id("itemmmenu_1_1")).click();

			
//			$.driver().use(driver);
//			$("#MENU_CONTENT").find("table").find(".itemmenu.home").find(".out").find(".hand").eq(0).click();
		
		//driver.switchTo().parentFrame()
		
//		$.driver().use(driver);
//		if (driver instanceof JavascriptExecutor) {
//			((JavascriptExecutor)driver).executeScript("$ = top.document.getElementsByTagName('frameset')[0].framePortal.window.jQuery;");
//			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//			$("#MENU_CONTENT").find("table").find(".itemmenu.home").find(".out").find(".hand").eq(0).click();
//			
//		} else {
//		    throw new IllegalStateException("This driver does not support JavaScript!");
//		}
	}

}
