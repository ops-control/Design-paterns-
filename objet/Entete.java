import java.util.Date;
import java.text.SimpleDateFormat;

public class Entete  {
    private TexteCentre titre;
    private TexteCentre auteur;
    private TexteCentre date;
    public Entete(String titre,String auteur, Date date){
        this.titre=new TexteCentre(titre);
        this.auteur=new TexteCentre(auteur);
        SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");
        this.date=new TexteCentre(formatDate.format(date));
    }

    public Entete(String titre,String auteur){
        this.titre=new TexteCentre(titre);
        this.auteur=new TexteCentre(auteur);
        SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");
        Date date=new Date();
        this.date=new TexteCentre(formatDate.format(date));
    }

    public void fixeLargeur(int l){
        titre.fixeLargeur(l);
        auteur.fixeLargeur(l);
        date.fixeLargeur(l);
    }

    public String toString(){
        StringBuilder resultat = new StringBuilder();
        resultat.append( titre.toString()+"\n");
        resultat.append( auteur.toString()+"\n");
        resultat.append( date.toString());

        return resultat.toString();



    }


}





