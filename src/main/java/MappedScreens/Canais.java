package MappedScreens;

import java.util.ArrayList;
import java.util.List;

import ParametrosDeAutomacao.ElementosDaTela;
import ParametrosDeAutomacao.TypeActionClick;
import ParametrosDeAutomacao.TypeElementId;
import ParametrosDeAutomacao.TypeElementName;
import ParametrosDeAutomacao.TypeElementXPatch;
import util.UtilTest;

public class Canais {

	public static void acessaCRM(String urlLogin){
		List<ElementosDaTela> elementos = new ArrayList<ElementosDaTela>();
		elementos.add(new ElementosDaTela(new TypeElementXPatch(), "//*[@id='itemmenu_2_8']", new TypeActionClick(), "", "Imgs/MenuLateral/Canais/CRM.png"));
		
		UtilTest.triggerAutomated("", elementos);

	}
	public static CallCenter acessaCallCenter(String urlLogin){
		List<ElementosDaTela> elementos = new ArrayList<ElementosDaTela>();
		elementos.add(new ElementosDaTela(new TypeElementId(), "itemmenu_2_8_image", new TypeActionClick(), "", "Imgs/MenuLateral/Canais/CallCenter.png"));
		
		UtilTest.triggerAutomated("", elementos);
		return new CallCenter();
	}
}
