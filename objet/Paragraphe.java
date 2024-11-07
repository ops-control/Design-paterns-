import java.util.ArrayList;

public class Paragraphe{
    private ArrayList<String> mots;
    private int largeur;
    public Paragraphe(){
        this.mots=new ArrayList<>();
        this.largeur=100;
    }
    public void fixeLargeur(int l){
        this.largeur=l;
    }

    public void ajoute(String mot){
        mots.add(mot);
    }

    public int nbLignes(){
        int res=0;
        int nbcar=largeur;
        for( String e:mots){
            while(nbcar>0){
                if(nbcar-e.length()==0 && nbcar-e.length()< 0){
                    res=res+1;
                }
        }

    }

}