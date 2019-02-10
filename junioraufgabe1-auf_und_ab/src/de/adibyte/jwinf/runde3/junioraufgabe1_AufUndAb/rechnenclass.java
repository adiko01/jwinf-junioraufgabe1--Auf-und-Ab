package de.adibyte.jwinf.runde3.junioraufgabe1_AufUndAb;

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class rechnenclass {
	/** Wie viele Züge es gab **/
	public static int z = 0;
	/** Die Ausgewählte Augen Zahl **/
	public static int a = 0;
	/** Die Aktuelle Position **/
	public static int i = 0;
	/** Die gesammtanzahlt der genutzten Leiter **/
	public static int Lanz = 0;
	/** Die genutzten felder **/
	public static String feld = "";
	public static void InRechnen (int nummer) {
		/** Setzt die aktuelle Position der Spielfigur auf feld 1 **/
		i = 1;
		/** Speichert die Augenzahl ab **/
		a = nummer;
		/** Setzt die Züge auf 0 **/
		z = 0;
		/** Setzt die Leiterzahl auf 0 **/
		Lanz = 0;
		/** leert den Felder String **/
		feld = "START";
		ziehen();
	}
	
	private static void ziehen() {
		/** Ein neuer Zug **/
		z++;
		/** Verschiebt die Spielfigur */
		int ia = i + a;
		i = ia;
		kontrolle();
	}
	
	private static void kontrolle() {	
		/** überprüfen der Leitern**/
			if(i==6) {
				i = 27;
				nachrechnen(1);
			}
			else if(i==14) {
				i = 19;
				nachrechnen(1);
			}
			else if(i==19) {
				i = 14;
				nachrechnen(1);
			}
			else if(i==21) {
				i = 53;
				nachrechnen(1);
			}
			else if(i==27) {
				i = 6;
				nachrechnen(1);
			}
			else if(i==31) {
				i = 42;
				nachrechnen(1);
			}
			else if(i==33) {
				i = 38;
				nachrechnen(1);
			}
			else if(i==38) {
				i = 33;
				nachrechnen(1);
			}
			else if(i==42) {
				i = 31;
				nachrechnen(1);
			}
			else if(i==46) {
				i = 62;
				nachrechnen(1);
			}
			else if(i==51) {
				i = 59;
				nachrechnen(1);
			}
			else if(i==53) {
				i = 21;
				nachrechnen(1);
			}
			else if(i==57) {
				i = 96;
				nachrechnen(1);
			}
			else if(i==59) {
				i = 51;
				nachrechnen(1);
			}
			else if(i==62) {
				i = 46;
				nachrechnen(1);
			}
			else if(i==65) {
				i = 85;
				nachrechnen(1);
			}
			else if(i==68) {
				i = 80;
				nachrechnen(1);
			}
			else if(i==70) {
				i = 76;
				nachrechnen(1);
			}
			else if(i==76) {
				i = 70;
				nachrechnen(1);
			}
			else if(i==80) {
				i = 68;
				nachrechnen(1);
			}
			else if(i==85) {
				i = 65;
				nachrechnen(1);
			}
			else if(i==92) {
				i = 98;
				nachrechnen(1);
			}
			else if(i==96) {
				i = 57;
				nachrechnen(1);
			}
			else if(i==98) {
				i = 92;
				nachrechnen(1);
			}
			/** überpprüft ob das Ziel erreicht wurde**/
			else if(i==100) {
				fertig();
			}
			/** überprüft ob das Ziel überschritten wurde **/
			else if (i>100) {
				int more = i - 100;
				i = 100 - more;
				kontrolle();
			}
			/** wenn keie Leiter verwendet wurde oder das Ziel nicht erreicht oder überschritten wurde - wird der nächste Zug eingeleitet **/
			else {
				nachrechnen(0);
			}
	}
	
	private static void nachrechnen(int mode) {
		
		if (mode==0) {
			/** Überprüft ob die Figur auf diesem Feld schon einmal stand **/
			String FELDD = "" + i;
			if (feld == "START") {
				String feld1 = feld + ": " + FELDD;
				feld = feld1;
				ziehen();
			}
			else if(feld.contains(FELDD)) {
				fertig_fehler();
			}
			else {
				String feld2 = feld + " ; " + FELDD;
				feld = feld2;
				ziehen();
			}
		}
		else if (mode==1) {
			/** Gesammtanzahl der Leitern die Benutzt wurden **/
			Lanz ++;
			/** Lieiter in verlauf anzeigen **/
			String feld3 = feld + " ; L" + " ; " + i;
			feld =feld3;
			ziehen();
		}
		else {
			de.adibyte.tools.AllgmeinError.main("JWINF - Junioraufgabe1: Auf und Ab - Adrian Ivo Kolar | ERROR");
		}
	}
	private static void fertig_fehler() {
		ImageIcon icon = new ImageIcon(de.adibyte.tools.AllgmeinError.class.getResource("pic/madamewatermelon/nicht-wuerfel-figur-romey.png"));
		JOptionPane.showMessageDialog(null, "\n"
				+ "Wenn davon ausgegengen wird, dass der Spieler immer eine "
				+ de.adibyte.jwinf.runde3.junioraufgabe1_AufUndAb.rechnenclass.a
				+ " würfelt kann das Ziel nicht erreicht weeren\n"
				+ "\n"
				+ "Nach "
				+ de.adibyte.jwinf.runde3.junioraufgabe1_AufUndAb.rechnenclass.z
				+ " Zügen wurde das Programm abgebrochen\n"
				+ "\n"
				+ "Die besuchten Felder Waren:\n"
				+ feld + " ; " + i
				, "JWINF - Junioraufgabe1: Auf und Ab - Adrian Ivo Kolar | Ergebniss - Klappt nicht", JOptionPane.QUESTION_MESSAGE, icon);
	}
	private static void fertig() {
		ImageIcon icon = new ImageIcon(de.adibyte.tools.AllgmeinError.class.getResource("pic/madamewatermelon/wuerfel-figur-romey.png"));
		JOptionPane.showMessageDialog(null, "\n"
				+ "Um das Ziel zu erreichen werden "
				+ de.adibyte.jwinf.runde3.junioraufgabe1_AufUndAb.rechnenclass.z
				+ " Züge benötigt.\n"
				+ "\n"
				+ "Wenn davon ausgegengen wird, dass der Spieler immer eine "
				+ de.adibyte.jwinf.runde3.junioraufgabe1_AufUndAb.rechnenclass.a
				+ " würfelt\n"
				+ "\n"
				+ "Es wurden auf dem Weg nach oben "
				+ de.adibyte.jwinf.runde3.junioraufgabe1_AufUndAb.rechnenclass.Lanz
				+ " Leitern benutzt\n"
				+ "Die besuchten Felder Waren:\n"
				+ feld + " ; " + i
				, "JWINF - Junioraufgabe1: Auf und Ab - Adrian Ivo Kolar | Ergebniss - Klappt", JOptionPane.QUESTION_MESSAGE, icon);
	}
}
