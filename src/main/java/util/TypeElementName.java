package util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import TestCases.Parametros;

public class TypeElementName implements TypeElements{

	public WebElement find(WebDriver driver, ElementosDaTela edl) {
		return driver.findElement(By.name(edl.getName()));
	}



}
