package MappedScreens;

import org.openqa.selenium.WebDriver;

public class menuIniciarAtendimento {
	
	private WebDriver driver;
    public menuIniciarAtendimento(WebDriver driver) {							
        this.driver = driver;
    }
    public void visitaUrl() {
        driver.get("localhost:8080/????"); // Atendimento passa antes por algumas validações. Verificar como fazer
        }

}
