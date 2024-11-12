import java.io.PrintStream;

public class Chapitre{
    private BlocDeTexte bloc;
    private TexteCentre titre;
    public Chapitre(String t){
        this.bloc=new BlocDeTexte();
        this.titre=new TexteCentre(t);
    }

    public void ajoute(Paragraphe p){
        bloc.ajoute(p);
    }
    
    public void fixeLargeur(int l){
        bloc.fixeLargeur(l);
        titre.fixeLargeur(l);

    }
    public void ecris(PrintStream p){
        p.println(titre.toString());
        bloc.ecris(p);

    }
    public String toString(){

        return "Le Titre di chapitre : "+titre.texte()+"\n"+bloc.toString() ;
    }

}