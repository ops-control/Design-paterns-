import java.io.PrintStream;
import java.util.ArrayList;

public class BlocDeTexte{
    private ArrayList<Paragraphe> paragraphes;

    public BlocDeTexte(){
        this.paragraphes= new ArrayList<>();
    }

    public void ajoute(Paragraphe p){
        paragraphes.add(p);
    }

    public void fixeLargeur(int l){
        for (Paragraphe e:paragraphes){
            e.fixeLargeur(l);
        }
    }

    public void ecris(PrintStream p){
        for (Paragraphe e:paragraphes){
            p.println(e);
        }

    }

    public String toString(){
        return "Bloc de texte avec "+paragraphes.size()+ "paragraphes";
    }
}