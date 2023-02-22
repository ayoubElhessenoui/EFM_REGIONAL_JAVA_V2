import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Magasin {
    ArrayList<Article> magasins;

    public int indicDe(int code){
        int var = -1;
        for(Article a:magasins){
            if(a.getCode() == code)
                var = magasins.indexOf(a);
        }
        return var;
    }

    public void ajouter(Article a) throws Exception{
        if(magasins.contains(a))
            throw new Exception("le produit déja existe à la boutique");
        else
            magasins.add(a);
    }

    public boolean supprimer(int code){
        boolean var = false;
        for (Article a:magasins){
            if (a.getCode() == code)
                var = true;
            magasins.remove(a);
        }
        return var;
    }

    public boolean supprimer(Article a){
        if (magasins.contains(a)) {
            magasins.remove(a);
            return true;
        }else
            return false;
    }

    public int nombreProduitsEnSolde(){
        return magasins.size();
    }

    public void enregistrer(String chemin)throws Exception{
        File file = new File(chemin);
        FileWriter fw = new FileWriter(file);
        PrintWriter pw = new PrintWriter(fw);

        for(Article a:magasins){
            pw.println(a);
        }
        pw.close();
    }
}
