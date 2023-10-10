package com.ism;
import java.util.Scanner;

import com.ism.models.ArticleConf;
import com.ism.models.Categorie;
import com.ism.models.Unite;
import com.ism.repositories.ITable;
import com.ism.repositories.list.ArticleConfTable;
import com.ism.repositories.list.CategorieTable;
import com.ism.repositories.list.UniteTable;
import com.ism.services.impl.ArticleConfServiceImpl;
import com.ism.services.impl.CategorieServiceImpl;
import com.ism.services.impl.UniteServiceImpl;


public class Main {
    public static void main(String[] args) throws Exception {

        ITable<Categorie> repository=new CategorieTable();
        ITable<ArticleConf>reposito=new ArticleConfTable();
        ITable<Unite>repo=new UniteTable();

        CategorieServiceImpl categorieServiceImpl=new CategorieServiceImpl(repository);
        ArticleConfServiceImpl articleConfServiceImpl=new ArticleConfServiceImpl(reposito);
        UniteServiceImpl uniteServiceImpl=new UniteServiceImpl(repo);
        
       int choix;
       try (Scanner sc = new Scanner(System.in)) {
        do{
            System.out.println(" -------------------");
            System.out.println(" AJOUT");
            System.out.println(" -------------------");
            System.out.println("1-Ajouter Article de Confection");
            System.out.println("2-Ajouter Catégorie");
            System.out.println("3-Ajouter Unite");
            System.out.println("-------------------");
            System.out.println(" LISTAGE");
            System.out.println(" -------------------");
            System.out.println("4-Lister Article de Confection");
            System.out.println("5-Lister Catégorie ");
            System.out.println("6-Lister Unite ");
            System.out.println("-------------------");
            System.out.println(" MODIFICATION");
            System.out.println("-------------------");
            System.out.println("7-Modifier Article de Confection ");
            System.out.println("8-Modifier Catégorie ");
            System.out.println("9-Modifier Unité ");
            System.out.println(" -------------------");
            System.out.println(" SUPPRESSION");
            System.out.println(" -------------------");
            System.out.println("10-Supprimer Article de Confection ");
            System.out.println("11-Supprimer Catégorie ");
            System.out.println("12-Supprimer Unité ");
            System.out.println("0-Quitter");
            choix= sc.nextInt();
            sc.nextLine();
            switch (choix){
                case 1:
                    System.out.println("\n Ajouter un Article de Confection \n");
                    System.out.println("n°");
                    int id =sc.nextInt();
                    System.out.println("Entrez le libelle : ");
                    String libelle =sc.next();
                    System.out.println("Entrez le prix : ");
                    double prix=Double.parseDouble(sc.next());
                    System.out.println("Entrez la quantité : ");
                    int qte= sc.nextInt();
                    ArticleConf articleConf = new ArticleConf(id,libelle,prix,qte);
                    articleConfServiceImpl.add(articleConf);
                    break;
        
                case 2:
                    System.out.println("\n Ajouter une catégorie\n");
                    System.out.println("Entrez le libelle");
                    Categorie categorie=new Categorie(sc.nextLine());
                    categorieServiceImpl.add(categorie);
                    break;

                case 3:
                    System.out.println("\n Ajouter une unité\n");
                    System.out.println("entrez le libelle : ");
                    Unite unite=new Unite(sc.nextLine());
                    uniteServiceImpl.add(unite);
                    break;

                case 4:
                    System.out.println(" \n Liste Article de Confection\n ");
                    System.out.println(" -------------------");
                    articleConfServiceImpl.getAll().forEach(System.out::println);
                    System.out.println(" -------------------");
                    break;
                
                case 5:
                    System.out.println("\n Liste des Categories\n");
                    System.out.println(" -------------------");
                    categorieServiceImpl.getAll().forEach(System.out::println);
                    System.out.println(" -------------------");
                    break;
                
                case 6:
                    System.out.println("\nListe des Unités \n");
                    System.out.println(" -------------------");
                    uniteServiceImpl.getAll().forEach(System.out::println);
                    System.out.println(" -------------------");
                    break;
                case 10:
                    System.out.println("\n Entrer l'ID de l'Artcle de Confection à supprimer:");
                    int idArticle=sc.nextInt();
                    articleConfServiceImpl.remove(idArticle);
                    articleConfServiceImpl.getAll();
                    break;
                case 11:
                    System.out.println("\n Entrer l'ID de la Catégorie à supprimer:");
                    int idCat=sc.nextInt();
                    categorieServiceImpl.remove(idCat);
                    break;
                default:
                    break;
            }    
        }while(choix!=0);
    }
    }
}

