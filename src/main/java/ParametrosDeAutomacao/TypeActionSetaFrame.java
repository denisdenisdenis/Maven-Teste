package ParametrosDeAutomacao;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TypeActionSetaFrame implements TypeAction {

	public void doit(WebDriver driver, ElementosDaTela el) {
		// TODO Auto-generated method stub
		driver.switchTo().frame(el.getElement());
	}

}
