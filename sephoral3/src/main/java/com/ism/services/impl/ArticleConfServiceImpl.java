package com.ism.services.impl;

import java.util.ArrayList;

import models.ArticleConf;
import repositories.ITable;
import services.inter.ArticleConfService;

public class ArticleConfServiceImpl implements ArticleConfService {
    private ITable<ArticleConf> ArticleConfRepo;


    public ArticleConfServiceImpl(ITable<ArticleConf> ArticleConfRepo){
        this.ArticleConfRepo = ArticleConfRepo ;
    }
    
    public void setArticleConfRepo(ITable<ArticleConf> articleConfRepo) {
        ArticleConfRepo = articleConfRepo;
    }

    //REDEFINOTIONS 

    @Override
    public int add(ArticleConf articleConf) {
        return ArticleConfRepo.insert(articleConf);
    }

    @Override
    public ArrayList<ArticleConf> getAll() {
       return ArticleConfRepo.findAll();
    }

    @Override
    public int update(ArticleConf data) {
        return 0;
    }

    @Override
    public ArticleConf show(int id) {
       return ArticleConfRepo.findById(id);
    }

    @Override
    public int remove(int id) {
        return ArticleConfRepo.delete(id);
    }

    @Override
    public int[] remove(int[] ids) {
        return null;
    }
        
}
