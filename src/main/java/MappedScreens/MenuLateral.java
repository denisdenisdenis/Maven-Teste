package MappedScreens;

import java.util.ArrayList;
import java.util.List;

import ParametrosDeAutomacao.ElementosDaTela;
import ParametrosDeAutomacao.TypeActionClick;
import ParametrosDeAutomacao.TypeElementId;
import util.UtilTest;

public class MenuLateral {

	public static void acessaCanais(String urlLogin){
		List<ElementosDaTela> elementos = new ArrayList<ElementosDaTela>();
		elementos.add(new ElementosDaTela(new TypeElementId(), "itemmenu_home_1_1", new TypeActionClick(), "", urlLogin+"/CCenterWeb/images/portal/icones/peq/ico_canais.gif"));
		
		UtilTest.triggerAutomated("", elementos);
	}


}
