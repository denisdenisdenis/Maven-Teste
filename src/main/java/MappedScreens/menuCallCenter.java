package MappedScreens;

import org.openqa.selenium.WebDriver;

public class menuCallCenter {
	private WebDriver driver;
    public menuCallCenter(WebDriver driver) {							
        this.driver = driver;
    }
	
    public void visitaUrl() {
        driver.get("localhost:8080/http://10.221.230.175:8980/CCenterWeb/Portal.dm?method=portal&redirect=&mensagem=");
	}
	public menuIniciarAtendimento IniciarAtendimento(){
		return new menuIniciarAtendimento(driver);
		
	}
}
