package MappedScreens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import TestCases.Parametros;
import util.TypeElements;

public class TypeiId implements TypeElements{

	public WebElement find(WebDriver driver, Parametros p) {
		return driver.findElement(By.id(p.getName()));
	}

}
