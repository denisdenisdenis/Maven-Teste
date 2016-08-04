package TestCases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import MappedScreens.MenuLateral;
import MappedScreens.Neoflow;
import util.UtilTest;


public class ChatNeoflowTestSystem {
	public static String baseUrl;
	public static String navegador;
	
	
	@Before
	public void inicializa() {
		navegador = "Chrome";
		//navegador = "FireFox";
		UtilTest.iniciaDriver(navegador);
		baseUrl = "http://10.221.230.175:9880";
	}

	@Test
	public void deveLogarNoChatViaNeoFlow() {
		Neoflow.logar(baseUrl,"adm", "123");
		MenuLateral.acessaCanais(baseUrl)	
		.acessaCallCenter("")
		.acessaIniciarAtendimento("");

	//	menuLateral.acessaHome().acessaCanais().acessaCallCenter();
		
		
	}
		
	
	@After
	public void close(){
	//	UtilTest.driver.close();
	}
}
	