package ParametrosDeAutomacao;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TypeElementName implements TypeElements{

	public WebElement find(WebDriver driver, ElementosDaTela el) {
		return driver.findElement(By.name(el.getName()));
	}



}
