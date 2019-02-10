//Webbrowser Klasse von adibyte
//Version: 5.2 vom 01.09.2018

package de.adibyte.tools;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class browser {
	String openURL = "http://adiko01.de";
	
	// Windows Browser �ffnen
	// aufzurufen �ber de.adibyte.tools.browser.MainBrowserA(openURL);	
	public static void MainBrowserA(String openURL) {
		try {
			Desktop.getDesktop().browse(new URI(openURL));
		} catch (IOException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
	}
	    
	// Windows Browser �ffnen
	// aufzurufen �ber de.adibyte.tools.browser.WindowsBrowser(openURL);
	public static void WindowsBrowser(String openURL) {
		try {
	        Runtime.getRuntime().exec(
	                "rundll32 url.dll,FileProtocolHandler "
	                        + openURL);
	    } catch (IOException e1) {
	        e1.printStackTrace();
	    }
	}

	// Linux Browser �ffnen
	// aufzurufen �ber de.adibyte.tools.browser.LinuxBrowser(openURL);
	public static void LinuxBrowser(String openURL){
		Runtime runtime = Runtime.getRuntime();
		try {
	        runtime.exec("xdg-open " + openURL);
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
}

