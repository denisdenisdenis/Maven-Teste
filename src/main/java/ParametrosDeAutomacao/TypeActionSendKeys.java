package ParametrosDeAutomacao;

import org.sikuli.script.Screen;

public class TypeActionSendKeys implements TypeAction {
	public static Screen s = new Screen();

	
	public void doit(ElementosDaTela el) {
		try{
			el.getElement().sendKeys(el.getValue());
			
		}catch (Exception e){
			try {
				s.click(el.getUrlImage());
				s.type(el.getValue());
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

}
