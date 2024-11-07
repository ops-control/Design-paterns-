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
		int justification;
		StringBuilder resultat = new StringBuilder();

		justification = (largeur - texte.length()) / 2;
		for (int i = 0; i < justification; i++) {
			resultat.append(' ');
		}
		resultat.append(texte);
		return resultat.toString();
	}
}
