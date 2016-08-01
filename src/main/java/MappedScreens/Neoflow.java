package MappedScreens;

import java.util.ArrayList;
import java.util.List;

import ParametrosDeAutomacao.ElementosDaTela;
import ParametrosDeAutomacao.TypeActionClick;
import ParametrosDeAutomacao.TypeActionSendKeys;
import ParametrosDeAutomacao.TypeElementId;
import ParametrosDeAutomacao.TypeElementName;
import util.UtilTest;


public class Neoflow {

	public static String caminhoLogin = "/CCenterWeb/Login.dm?method=abrirLogin";
	
	public static void logar(String urlLogin, String login, String senha) {
					
		List<ElementosDaTela> elementos = new ArrayList<ElementosDaTela>();
		elementos.add(new ElementosDaTela(new TypeElementName(), "login", new TypeActionSendKeys(), login, "Imgs/Login.png"));
		elementos.add(new ElementosDaTela(new TypeElementName(), "realSenha", new TypeActionSendKeys(), senha, "Imgs/Login.png"));
		elementos.add(new ElementosDaTela(new TypeElementId(), "msgBoto_login", new TypeActionClick(), "", "Imgs/BotaoLogar.png"));
		
		UtilTest.triggerAutomated(urlLogin + caminhoLogin, elementos);
		
		
	}


}
