package com.ism.repositories;

import java.util.ArrayList;

public interface ITable<Seph extends AbstractEntity> {

    int insert(Seph data);
    int update (Seph data);
    ArrayList<Seph>findAll();
    Seph findById(int id);
    int delete(int id);
    int indexOf(int id);
}
