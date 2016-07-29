package MappedScreens;

import org.openqa.selenium.WebDriver;

public class menuLateral {

		private WebDriver driver;
	    public menuLateral(WebDriver driver) {							
	        this.driver = driver;
	    }
	
	public void visita() {
        //driver.get("localhost:8080/usuarios");
		
	}
	public void visitaUrl() {
        driver.get("localhost:8080/CCenterWeb/Portal.dm?method=portal&redirect=&mensagem=");
	}
	public menuCRM crm(){
		return new menuCRM(driver);
		
	}
	public menuCallCenter callCenter(){
		return new menuCallCenter(driver);
		
	}


}
