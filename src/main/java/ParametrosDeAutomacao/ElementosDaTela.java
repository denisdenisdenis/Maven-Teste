package ParametrosDeAutomacao;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.html5.ClearSessionStorage;

public class ElementosDaTela {
	
	private String nameElement;
	
	private String value;

	private String urlImage;
	
	private TypeAction action;
	
	private TypeElement type;
	
	private WebElement element;
	
	public ElementosDaTela(TypeElement type, String nameElement, TypeAction action, String value, String urlImage) {
		super();
		this.type = type;
		this.action = action;
		this.nameElement = nameElement;
		this.value = value;
		this.urlImage = urlImage;
	}
	public ElementosDaTela(TypeElement type, String nameElement, TypeAction action) {
		super();
		this.action = action;
		this.nameElement = nameElement;
		this.type = type;
	}

	public TypeAction getAction() {
		return action;
	}


	public void setAction(TypeAction action) {
		this.action = action;
	}


	public TypeElement getType() {
		return type;
	}


	public void setType(TypeElement type) {
		this.type = type;
	}


	public String getNameElement() {
		return nameElement;
	}


	public void setNameElement(String name) {
		this.nameElement = name;
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
