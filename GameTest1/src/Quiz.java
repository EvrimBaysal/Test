
public class Quiz {
	private String frageImage;
	private char antwort;
	
	public Quiz(String fi, char a) {
		this.setFrageImage(fi);
		this.setAntwort(a);
	}
	
	public boolean isAntwortRichtig(char a) {
		if(antwort == a) {
			return true;
		}
		else {
			return false;
		}
	}

	public String getFrageImage() { return frageImage; }
	public void setFrageImage(String frageImage) { this.frageImage = frageImage; }

	public char getAntwort() { return antwort; }
	public void setAntwort(char antwort) { this.antwort = antwort; }
}
