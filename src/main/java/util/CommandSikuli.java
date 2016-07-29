package util;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

public class CommandSikuli implements Comando {

	private String urlImage;

	public CommandSikuli(String urlImage) {
		this.urlImage = urlImage;
	}

	public void run() {
		try {
			Screen s = new Screen();
			s.click(urlImage);
		} catch (FindFailed ex) {
			ex.printStackTrace();
		}
	}

	public String getUrlImage() {
		return urlImage;
	}

	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}

}
