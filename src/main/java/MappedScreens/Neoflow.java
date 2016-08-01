package MappedScreens;

import java.util.ArrayList;
import java.util.List;

import util.ElementosDaTela;
import util.TypeActionClick;
import util.TypeActionSendKeys;
import util.TypeElementId;
import util.TypeElementName;
import util.UtilTest;


public class Neoflow {

	public static String caminhoLogin = "/CCenterWeb/Login.dm?method=abrirLogin";
	
	public static void logar(String urlLogin, String login, String senha) {
		List<ElementosDaTela> elementos = new ArrayList<ElementosDaTela>();
		elementos.add(new ElementosDaTela(new TypeElementName(), "login", new TypeActionSendKeys(), login, "Imgs/Login.png"));
		elementos.add(new ElementosDaTela(new TypeElementName(), "realSenha", new TypeActionSendKeys(), senha, "Imgs/Login.png"));
		elementos.add(new ElementosDaTela(new TypeElementId(), "Bttn", new TypeActionClick(), "", "Imgs/Login.png"));
		
		UtilTest.triggerAutomated(urlLogin + caminhoLogin, elementos);
		
		
	}


}
