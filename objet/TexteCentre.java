public class TexteCentre {
	private String texte;
	private int largeur;


	public TexteCentre(String t) {
		this.texte = t;
		this.largeur = 100;
	}

	public TexteCentre(String t,int l) {
		this.texte = t;
		this.largeur = l;
	}



	public void fixeLargeur(int l) {
		largeur = l;
	}
	

	public String texte() {
		return texte;
	}

	public String toString() {
		int marge;
		StringBuilder resultat = new StringBuilder();

		marge = (largeur - texte.length()) / 2;
		for (int i = 0; i < marge; i++) {
			resultat.append(' ');
		}
		resultat.append(texte);
		return resultat.toString();
	}
}
