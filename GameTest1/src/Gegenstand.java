

public class Gegenstand {
	private String beschreibung;
	private String ort;
	private int posX;
	private int posY;
	private int hoehe;
	private int breite;
	private String image;
	private boolean isOpen;
	private boolean canOpen;
	private Raum r;
	
	public Gegenstand(String b, String o, int x, int y, String i, boolean io, boolean co, Raum ra, int ho, int br){
		beschreibung = b; ort = o; posX = x; posY = y; image = i; isOpen = io; canOpen = co; r = ra; hoehe = ho; breite = br;
	}
	
	public void blink() {
		//TODO: blinken wenn benutzer Hinweis braucht.
	}
	
	public void setBeschreibung(String b){ beschreibung = b; }
	public String getBeschreibung(){ return beschreibung; }
	
	public void setPosX(int x){ posX = x; }
	public int getPosX(){ return posX; }
	
	public void setPosY(int y){ posY = y; }
	public int getPosY(){ return posY; }
	
	public void setOrt(String o){ ort = o; }
	public String getOrt(){ return ort; }
	
	public void setImage(String i){ image = i; }
	public String getImage(){ return image; }
	
	public void setIsOpen(boolean o) { isOpen = o;}
	public boolean getIsOpen() { return isOpen; }
	
	public void setCanOpen(boolean o) { canOpen = o;}
	public boolean getCanOpen() { return canOpen; }
	
	public void setRaum(Raum ra) { r = ra;}
	public Raum getRaum() { return r; }

	public int getHoehe() { return hoehe; }
	public void setHoehe(int hoehe) { this.hoehe = hoehe; }

	public int getBreite() { return breite; }
	public void setBreite(int breite) { this.breite = breite; }
}
