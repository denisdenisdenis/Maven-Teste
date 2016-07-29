package main;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

public class testeMain {
	
	private static WebDriver driver;
	
	public static void main(String args []){


//		
//	//	MappedScreens.logaNeoFlow usuario;
//		String baseUrl;
//		System.setProperty("webdriver.chrome.driver","C:/ChromeDriver/chromedriver.exe");
//		driver = new ChromeDriver();
//    // 	usuario = new logaNeoFlow(driver);
////		this.driver = new FirefoxDriver();
//		
//     	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		baseUrl = "http://10.221.230.175:9880/CCenterWeb/Login.dm?method=abrirLogin";
//		driver.get(baseUrl);
		
		
		
	     Screen s = new Screen();
	     try{
	    	 	s.click("Imgs/LoginNeoflow.png");
	     }
         catch(FindFailed e){
                 e.printStackTrace(); 
         }
	}
}
