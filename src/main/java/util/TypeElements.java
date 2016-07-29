package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import TestCases.Parametros;

public interface TypeElements {

	WebElement find(WebDriver driver, Parametros p);
}
