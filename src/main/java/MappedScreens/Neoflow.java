package MappedScreens;

import java.util.ArrayList;
import java.util.List;

import TestCases.Parametros;
import util.Comando;
import util.CommandSikuli;
import util.TypeName;
import util.UtilTest;

//import Seila.Utils;

public class Neoflow {

	public static String caminhoLogin = "/CCenterWeb/Login.dm?method=abrirLogin";
	
	public static void logar(String urlLogin, String login, String senha) {
		List<Parametros> parametros = new ArrayList<Parametros>();
		List<Comando> comandos = new ArrayList<Comando>();
		
		parametros.add(new Parametros(new TypeName(), "login", login, "Imgs/Login.png" ));
		parametros.add(new Parametros(new TypeName(), "realSenha", senha, "Imgs/Senha.png"));
		
		
		
		comandos.add(new CommandSikuli("Imgs/BotaoLogar.png"));
		
		UtilTest.actionNeoflow(urlLogin + caminhoLogin, parametros, comandos);
	}

}
