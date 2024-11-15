import java.util.Random;

/**
 * Programme de base fournit pour le TP, se référer au TP pour les détails.
 * @author Guillaume Huard
 */

abstract class Forme{
	private int x;
	private int y;
	private int taille;
	MachineTrace m;
	public Forme(MachineTrace m ){
		this.m=m;
		this.x=0;
		this.y=0;
		this.taille=50;
	}

	public void fixerPosition(int x,int y){
		this.x=x;
		this.y=y;
	}

	public void fixerTaille(int t){
		taille=t;
	}

	public int getTaille(){
		return taille;
	}
	public int getX(){
		return x;
	}

	public int getY(){
		return y;
	}
	public abstract void dessiner();
}

class Carre extends Forme{
	public Carre(MachineTrace m){
		super(m);
	}

	public void dessiner(){
		m.baisser();
		m.avancer(getTaille());
		m.tournerGauche(90);
		m.avancer(getTaille());
		m.tournerGauche(90);
		m.avancer(getTaille());
		m.tournerGauche(90);
		m.avancer(getTaille());
		m.lever();


	}
}

class Triangle extends Forme{
	private MachineTrace m;
	public Triangle(MachineTrace m){
		super(m);
		this.m=m;
	}

	public void dessiner(){
		m.baisser();
		m.avancer(getTaille());
		m.tournerGauche(60);
		m.avancer(getTaille());
		m.tournerGauche(60);
		m.avancer(getTaille());
		m.lever();

	}

}


public class FormesPulsantes {
	final static int nbFormes = 1;
	final static int nbObjets = 5;
	final static int etapesPulsations = 20;
	final static int amplitudePulsation = 20;
	final static int delai = 100;

	static Forme creerForme(int type, MachineTrace m) {
		switch (type) {
		case 0:
			return new Carre(m);
		/*case 1:
			return new Triangle(m);
		case 2:
			return new Cercle(m);
		case 3:
			return new Losange(m);*/
		default:
			throw new RuntimeException("Forme Inconnue");
		}
	}

	public static void main(String[] args) {
		MachineTrace m;
		Forme[] f;
		int[] tailles;
		Random r;

		m = new MachineTrace(400, 400);
		m.masquerPointeur();
		m.rafraichissementAutomatique(false);

		f = new Forme[nbObjets];
		tailles = new int[f.length];
		r = new Random();
		for (int i = 0; i < f.length; i++) {
			f[i] = creerForme(r.nextInt(nbFormes), m);
			f[i].fixerPosition(r.nextInt(200) - 100, r.nextInt(200) - 100);
			tailles[i] = r.nextInt(20) + 5;
		}

		while (true) {
			for (int j = 0; j <= etapesPulsations; j++) {
				m.effacerTout();
				int ajout = (int) (amplitudePulsation * (Math.sin(j * 2 * Math.PI / etapesPulsations) + 1) / 2);
				for (int i = 0; i < f.length; i++) {
					f[i].fixerTaille(tailles[i] + ajout);
					f[i].dessiner();
				}
				m.rafraichir();
				m.attendre(delai);
			}
		}
	}
}
