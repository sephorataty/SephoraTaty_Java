package com.ism.services;

import java.util.ArrayList;

public interface IService<Seph> {
    int  add(Seph data);
    ArrayList<Seph> getAll();
    int update(Seph data);
    Seph show(int id);
    int remove(int id);
    int[] remove(int[] ids);
}
