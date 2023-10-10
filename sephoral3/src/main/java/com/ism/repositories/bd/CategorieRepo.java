package com.ism.repositories.bd;
import com.ism.models.AbstractEntity;
import com.ism.ITable;

public class CategorieRepo implements ITable {
    @Override
    public int insert(AbstractEntity data){
        return 0;
    }
    @Override
    public int update(AbstractEntity data) {
        return 0;
    }

    @Override
    public ArrayList findAll() {
        return null;
    }

    @Override
    public AbstractEntity findByID(int id) {
        return null;
    }

    @Override
    public int delete(int id) {
        return 0;
    }

    @Override
    public int indexOf(int id) {
        return 0;
    }
}
