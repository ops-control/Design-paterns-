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
            if(nbcar>0){
                if(nbcar-e.length()==0) {
                    res=res+1;
                    nbcar=largeur;
                }
                else if (nbcar-e.length()< 0){
                    res=res+1;
                    nbcar=largeur-e.length()-1;

                }
                else{
                    nbcar=nbcar-e.length()-1;
                }
            }
        }
        return res;
    }

    public String toString(){
        int nbcar=largeur;
        StringBuilder paragraphe=new StringBuilder();
        for( String e:mots){
            if(nbcar>0){
                if(nbcar-e.length()==0) {
                    paragraphe.append(e+"\n");
                    nbcar=largeur;
                }
                else if (nbcar-e.length()< 0){
                    paragraphe.append("\n"+e+" ");
                    nbcar=largeur-e.length()-1;

                }
                else{
                    paragraphe.append(e+" ");
                    nbcar=nbcar-e.length()-1;
                }
            }
        }
        return paragraphe.toString();

    }

}    