package ParametrosDeAutomacao;

import org.sikuli.script.Screen;

public class TypeActionClick implements TypeAction{
	public static Screen s = new Screen();

	public void doit(ElementosDaTela el) {
		
		 try{
			 el.getElement().click(); 
			}catch (Exception e){
				try {
					s.click(el.getUrlImage());
					
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		
	}
	

}
