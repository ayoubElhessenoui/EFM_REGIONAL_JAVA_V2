public class ArticleEnSolde extends Article{
    private int remise;

    public ArticleEnSolde(int code, double prixOrigine,int remise) throws Exception {
        super(code, prixOrigine);
        setRemise(remise);
    }

    public int getRemise() {
        return remise;
    }

    public void setRemise(int remise) throws Exception{
        if(this.remise>0 && this.remise<=90)
            this.remise = remise;
        else throw new Exception("invalide remise");
    }

    @Override
    public double prixArticle() {
        return super.getPrixOrigine() - (super.getPrixOrigine() * remise/100);
    }

    @Override
    public String toString() {
        return super.toString()+";"+remise ;
    }
}
