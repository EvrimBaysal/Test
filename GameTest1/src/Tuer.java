
public class Tuer extends Gegenstand{
	private Raum nextRaum;
	private Quiz q;
	
	public Tuer(String b, String o, int x, int y, String i, boolean io, boolean co, Raum nr, Quiz q, Raum r, int ho, int br) {
		super(b, o, x, y, i, io, co, r, ho, br);
		this.nextRaum = nr;
		this.setQ(q);
	}
	
	public void setNextRaum(Raum ra) { nextRaum = ra;}
	public Raum getNextRaum() { return nextRaum; }

	public Quiz getQ() { return q; }
	public void setQ(Quiz q) { this.q = q; }
}
