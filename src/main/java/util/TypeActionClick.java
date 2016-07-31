package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import TestCases.Parametros;

public class TypeActionClick implements TypeAction{

	public void doit(ElementosDaTela edl) {
		 edl.getElement().click(); 
		
	}
	

}
