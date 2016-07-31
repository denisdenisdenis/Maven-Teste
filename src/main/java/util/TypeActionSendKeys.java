package util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import TestCases.Parametros;

public class TypeActionSendKeys implements TypeAction {

	
	public void doit(ElementosDaTela edl) {
		edl.getElement().sendKeys(edl.getValue());
	}

}
