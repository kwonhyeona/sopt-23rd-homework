package org.sopt.model;

import java.util.ArrayList;

public class DefaultArrayList<T> {
    private ArrayList<T> list = new ArrayList<>();

    public DefaultArrayList<T> addEntity(T entity) {
        list.add(entity);
        return this;
    }

    public void print() {
        for (T entity : list) {
            System.out.println(entity);
        }
    }
}
