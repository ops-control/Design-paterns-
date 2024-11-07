public class Entete extends TexteCentre {
    private String titre;
    private String auteur;
    private Date date;
    public Entete(String titre,String auteur, Date date){
        super(titre)
        this.titre=titre;
        this.auteur=auteur;
        this.date=date;
    }

    public Entete(String titre,String auteur){
        this.titre=titre;
        this.auteur=auteur;
        this.date=new Date();

    }

    public void fixeLargeur(int l){
        this.largeur=l;
    }


}





