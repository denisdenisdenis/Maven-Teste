package MappedScreens;

import java.util.ArrayList;
import java.util.List;

import ParametrosDeAutomacao.ElementosDaTela;
import ParametrosDeAutomacao.TypeActionClick;
import ParametrosDeAutomacao.TypeElementId;
import util.UtilTest;

public class CallCenter {

	public static void acessaIniciarAtendimento(String urlLogin){
		List<ElementosDaTela> elementos = new ArrayList<ElementosDaTela>();
		elementos.add(new ElementosDaTela(new TypeElementId(), "itemmenu_3_15_image", new TypeActionClick(), "", "Imgs/MenuLateral/Canais/CallCenter/IniciarAtendimento.png"));
		
		UtilTest.triggerAutomated("", elementos);

	}
	public static void acessaAdministracao(String urlLogin){
		List<ElementosDaTela> elementos = new ArrayList<ElementosDaTela>();
		elementos.add(new ElementosDaTela(new TypeElementId(), "", new TypeActionClick(), "", "Imgs/MenuLateral/Canais/CallCenter/Administracao.png"));
		
		UtilTest.triggerAutomated("", elementos);

	}
	public static void acessaCadastros(String urlLogin){
		List<ElementosDaTela> elementos = new ArrayList<ElementosDaTela>();
		elementos.add(new ElementosDaTela(new TypeElementId(), "", new TypeActionClick(), "", "Imgs/MenuLateral/Canais/CallCenter/Cadastros.png"));
		
		UtilTest.triggerAutomated("", elementos);

	}
	public static void acessaEspecifico(String urlLogin){
		List<ElementosDaTela> elementos = new ArrayList<ElementosDaTela>();
		elementos.add(new ElementosDaTela(new TypeElementId(), "", new TypeActionClick(), "", "Imgs/MenuLateral/Canais/CallCenter/Especifico.png"));
		
		UtilTest.triggerAutomated("", elementos);

	}

}
