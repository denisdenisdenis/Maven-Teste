package ParametrosDeAutomacao;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public interface TypeElement {

	WebElement find(WebDriver driver, ElementosDaTela el);
}
