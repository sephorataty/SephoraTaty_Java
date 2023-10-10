package com.ism.models;

public class Unite extends AbstractEntity {

    public Unite() {
        super();
    }

    public Unite(int id, String libelle) {
        super(id, libelle);
    }

    public Unite(String libelle) {
        super(libelle);
    }
    
    @Override
    public String toString() {
        return "Unite" + super.toString();
    }
}
