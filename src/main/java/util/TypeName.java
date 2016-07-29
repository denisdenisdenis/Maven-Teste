package util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import TestCases.Parametros;

public class TypeName implements TypeElements{

	public WebElement find(WebDriver driver, Parametros p) {
		return driver.findElement(By.name(p.getName()));
	}



}
