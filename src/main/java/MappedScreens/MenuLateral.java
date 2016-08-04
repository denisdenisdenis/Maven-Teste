package MappedScreens;

import java.util.ArrayList;
import java.util.List;

import ParametrosDeAutomacao.ElementosDaTela;
import ParametrosDeAutomacao.TypeActionClick;
import ParametrosDeAutomacao.TypeActionSetaFrame;
import ParametrosDeAutomacao.TypeElementId;
import ParametrosDeAutomacao.TypeElementXPatch;
import util.UtilTest;

public class MenuLateral {

	
	private static void setaFrameMenuLateral(){
		List<ElementosDaTela> elementos = new ArrayList<ElementosDaTela>();
		elementos.add(new ElementosDaTela(new TypeElementId(), "framePortal", new TypeActionSetaFrame()));
		UtilTest.triggerAutomated("", elementos);
	}
	
	public static Canais acessaCanais(String urlLogin){
		setaFrameMenuLateral();
		List<ElementosDaTela> elementos = new ArrayList<ElementosDaTela>();
		elementos.add(new ElementosDaTela(new TypeElementXPatch(), "//*[@id='itemmenu_home_1_1']", new TypeActionClick(), "", "Imgs/MenuLateral/Canais.png"));
		
		UtilTest.triggerAutomated("", elementos);
		return new Canais();
	}

	public static void acessaBaseDeConhecimento(String urlLogin){
		List<ElementosDaTela> elementos = new ArrayList<ElementosDaTela>();
		elementos.add(new ElementosDaTela(new TypeElementId(), "", new TypeActionClick(), "", "Imgs/MenuLateral/Base_de_conhecimentos.png"));
		
		UtilTest.triggerAutomated("", elementos);
	}
	public static void acessaCadastros(String urlLogin){
		List<ElementosDaTela> elementos = new ArrayList<ElementosDaTela>();
		elementos.add(new ElementosDaTela(new TypeElementId(), "", new TypeActionClick(), "", "Imgs/MenuLateral/Cadastros.png"));
		
		UtilTest.triggerAutomated("", elementos);
	}
	public static void acessaWorkflow(String urlLogin){
		List<ElementosDaTela> elementos = new ArrayList<ElementosDaTela>();
		elementos.add(new ElementosDaTela(new TypeElementId(), "", new TypeActionClick(), "", "Imgs/MenuLateral/Workflow.png"));
		
		UtilTest.triggerAutomated("", elementos);
	}
	public static void acessaRelatorios(String urlLogin){
		List<ElementosDaTela> elementos = new ArrayList<ElementosDaTela>();
		elementos.add(new ElementosDaTela(new TypeElementId(), "", new TypeActionClick(), "", "Imgs/MenuLateral/Relatorios.png"));
		
		UtilTest.triggerAutomated("", elementos);
	}
	
}
