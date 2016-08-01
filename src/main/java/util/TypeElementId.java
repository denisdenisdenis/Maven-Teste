package util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class TypeElementId implements TypeElements{

	public WebElement find(WebDriver driver, ElementosDaTela el) {
		return driver.findElement(By.id(el.getName()));
	}

	
}
