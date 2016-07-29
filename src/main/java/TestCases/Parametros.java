package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.TypeElements;

public class Parametros {
	
	private TypeElements type;
	
	private String name;
	
	private String value;
	
	private WebElement element;

	private String urlImage;
	
	public Parametros(TypeElements type, String name, String value, String urlImage) {
		super();
		this.type = type;
		this.name = name;
		this.value = value;
		this.urlImage = urlImage;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public WebElement getElement() {
		return element;
	}

	public void setElement(WebElement element) {
		this.element = element;
	}

	public String getUrlImage() {
		return urlImage;
	}

	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}



	public TypeElements getType() {
		return type;
	}



	public void setType(TypeElements type) {
		this.type = type;
	}

	
	
	
	
}
