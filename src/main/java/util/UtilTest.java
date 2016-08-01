package util;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ParametrosDeAutomacao.ElementosDaTela;

public class UtilTest {

	public static WebDriver driver;

	public static void triggerAutomated(String urlLogin, List<ElementosDaTela> elementos) {
		if (!urlLogin.isEmpty())
			driver.get(urlLogin);
		if (elementos != null) {
			executarComandos(elementos);
		}
	}

	private static void executarComandos(List<ElementosDaTela> elementos) {
		for (ElementosDaTela el : elementos) {
			try {
				el.setElement(el.getType().find(driver, el));
			} catch (Exception e) {
			}
			try {
				el.getAction().doit(el);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}

	}



	public static void iniciaDriver(String navegador) {
		if (navegador == "Chrome") {
			System.setProperty("webdriver.chrome.driver", "C:/ChromeDriver/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			
//			driver.findElement(By.className(className));
//			driver.findElement(By.cssSelector(selector));
//			driver.findElement(By.linkText(linkText));
//			driver.findElement(By.partialLinkText(linkText));
//			driver.findElement(By.tagName(name));
//			driver.findElement(By.xpath(xpathExpression));
			
			
		}
		// implementar outros navegadores
	}
}
