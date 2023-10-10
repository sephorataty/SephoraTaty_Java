package com.ism.services.impl;

import java.util.ArrayList;

import models.Categorie;
import repositories.ITable;
import services.inter.CategorieService;

public class CategorieServiceImpl implements CategorieService {
    private ITable<Categorie> CategorieRepo;

    public CategorieServiceImpl(ITable<Categorie> CategorieRepo) {
        this.CategorieRepo = CategorieRepo;
    }

    public void setCategorieRepo(ITable<Categorie> CategorieRepo) {
        this.CategorieRepo = CategorieRepo;
    }

    //REDEFINITION

    @Override
    public int add(Categorie categorie) {
       return CategorieRepo.insert(categorie);
    }

    @Override
    public ArrayList<Categorie> getAll() {
       return CategorieRepo.findAll();
    }

    @Override
    public int update(Categorie data) {
       return 0;
    }

    @Override
    public Categorie show(int id) {
       return CategorieRepo.findById(id);
    }

    @Override
    public int remove(int id) {
        return CategorieRepo.delete(id);
    }

    @Override
    public int[] remove(int[] ids) {
        return null;
    }
    
}
