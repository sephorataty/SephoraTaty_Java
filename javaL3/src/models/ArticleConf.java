package models;

import java.util.ArrayList;

public class ArticleConf extends AbstractEntity{

    private double prix;
    private int qte;
    private ArrayList<Categorie>categories= new ArrayList<Categorie>();
    private ArrayList<Unite>unites= new ArrayList<Unite>();


    public ArticleConf(){
        super();
    }
    
    public ArticleConf(int id, String libelle, double prix, int qte) {
        super(id,libelle);
        this.prix = prix;
        this.qte = qte;
    }

    public double getPrix() {
            return prix;
        }

    public void setPrix(double prix) {
            this.prix = prix;
        }

    public int getQte() {
            return qte;
        }

    public void setQte(int qte) {
            this.qte = qte;
        }
    
    public ArrayList<Categorie> getCategories() {
         return categories;
        }

    public void addCategories(Categorie categorie){
            categories.add(categorie);
        }

    public ArrayList<Unite> getUnites() {
            return unites;
        }
    public void addUnites(Unite unite){
            unites.add(unite);
        }

    @Override
    public String toString() {
        return super.toString()+"prix=" + prix + "qte=" + qte + "\ncategories=" + categories + "\nunites=" + unites + "]";
    }

    
}
