package util;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.html5.ClearSessionStorage;

public class ElementosDaTela {
	private TypeElements type;
	
	private String name;
	
	private String value;
	
	private WebElement element;

	private String urlImage;
	
	private TypeAction action;
	
	
	public ElementosDaTela(TypeElements type, String name, TypeAction action) {
		super();
		this.type = type;
		this.action = action;
		this.name = name;
		this.value = value;
		this.urlImage = urlImage;
	}


	public TypeAction getAction() {
		return action;
	}


	public void setAction(TypeAction action) {
		this.action = action;
	}


	public TypeElements getType() {
		return type;
	}


	public void setType(TypeElements type) {
		this.type = type;
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

}
