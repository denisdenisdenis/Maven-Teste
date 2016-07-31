package util;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

import TestCases.Parametros;

public class UtilTest {

	public static WebDriver driver;
	public static Screen s = new Screen();

//	public static void actionNeoflow(String urlLogin, List<Parametros> parametros, List<Comando> comandos) {
//		if (!urlLogin.isEmpty())
//			driver.get(urlLogin);
//		if (parametros != null) {
//			preencherCampos(parametros);
//		}
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		if (comandos != null) {
//			disparaComandos(comandos);
//		}
//	}
	
	public static void triggerAtomated(String urlLogin, List<ElementosDaTela> elementos){
		if (!urlLogin.isEmpty())
			driver.get(urlLogin);
		if (elementos != null) {
			executarComandos(elementos);
		}
	}

//	private static void disparaComandos(List<Comando> comandos) {
//		for (Comando c : comandos) {
//			c.run();
//			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//		}
//	}

//	private static void preencherCampos(List<Parametros> parametros) {
//		for (Parametros p : parametros) {
//			try {
//				p.setElement(p.getType().find(driver, p));
//				p.getElement().sendKeys(p.getValue());
//			} catch (Exception e) {
//				try {
//					s.click(p.getUrlImage());
//					s.type(p.getValue());
//				} catch (Exception ex) {
//					ex.printStackTrace();
//				}
//			}
//
//		}
//	}
	private static void executarComandos(List<ElementosDaTela> elementos){
		for(ElementosDaTela edl: elementos){
			edl.setElement(edl.getType().find(driver, edl));
		    edl.getAction().doit(edl);
		
		}
			
	}

	public static void iniciaDriver(String navegador) {
		if (navegador == "Chrome"){
			System.setProperty("webdriver.chrome.driver", "C:/ChromeDriver/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		//implementar outros navegadores
	}
}
