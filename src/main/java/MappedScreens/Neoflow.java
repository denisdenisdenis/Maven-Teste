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
//		List<Parametros> parametros = new ArrayList<Parametros>();
//		List<Comando> comandos = new ArrayList<Comando>();
//		
//		parametros.add(new Parametros(new TypeElementName(), "login", login, "Imgs/Login.png" ));
//		parametros.add(new Parametros(new TypeElementName(), "realSenha", senha, "Imgs/Senha.png"));
//
//		comandos.add(new CommandSikuli("Imgs/BotaoLogar.png"));
//		
//		UtilTest.actionNeoflow(urlLogin + caminhoLogin, parametros, comandos);

				
		
		
		// Essa list deve ser preenchida na ordem de execucao
		List<ElementosDaTela> elementos = new ArrayList<ElementosDaTela>();
		elementos.add(new ElementosDaTela(new TypeElementName(), "login", new TypeActionSendKeys(), login, "Imgs/Login.png"));
		elementos.add(new ElementosDaTela(new TypeElementName(), "realSenha", new TypeActionSendKeys(), senha, "Imgs/Login.png"));
		elementos.add(new ElementosDaTela(new TypeElementId(), "Bttn", new TypeActionClick(), "", "Imgs/Login.png"));
		
		UtilTest.triggerAtomated(urlLogin + caminhoLogin, elementos);
		
	
		
		
		
	}


}
