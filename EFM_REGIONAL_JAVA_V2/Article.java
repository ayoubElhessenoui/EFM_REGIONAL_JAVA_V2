import java.util.Objects;

public class Article {
    private int code;
    private double prixOrigine;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getPrixOrigine() {
        return prixOrigine;
    }

    public void setPrixOrigine(double prixOrigine) {
        this.prixOrigine = prixOrigine;
    }

    public Article(int code, double prixOrigine) {
        this.code = code;
        this.prixOrigine = prixOrigine;
    }

    @Override
    public String toString() {
        return this.code + ";" + this.prixOrigine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Article article = (Article) o;
        return code == article.code && Double.compare(article.prixOrigine, prixOrigine) == 0;
    }

    public double prixArticle() {
        return prixOrigine;
    }
}

