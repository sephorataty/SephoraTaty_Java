package services.Impl;

import java.util.ArrayList;

import models.Unite;
import repositories.ITable;
import services.Inter.UniteService;

public class UniteServiceImpl implements UniteService {
    private ITable<Unite> UniteRepo;
    

    public UniteServiceImpl(ITable<Unite> uniteRepo) {
        this.UniteRepo = uniteRepo;
    }

    public void setUniteRepo(ITable<Unite> uniteRepo) {
        UniteRepo = uniteRepo;
    }


        //REDEFINITIONS 
        
    @Override
    public int add(Unite data) {
       return UniteRepo.insert(data);
    }

    @Override
    public ArrayList<Unite> getAll() {
       return UniteRepo.findAll();
    }

    @Override
    public int update(Unite data) {
       return 0;
    }

    @Override
    public Unite show(int id) {
       return UniteRepo.findById(id);
    }

    @Override
    public int remove(int id) {
       return UniteRepo.delete(id);
    }

    @Override
    public int[] remove(int[] ids) {
       return null;
     }
    
}
