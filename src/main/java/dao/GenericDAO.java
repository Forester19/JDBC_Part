package dao;

import model.BaseModel;

import java.util.ArrayList;

/**
 * Created by Владислав on 28.04.2017.
 */
public interface GenericDAO<T extends BaseModel> {

    void create();
    void update( T t);
    ArrayList<T> select();
    void delete(T t);
}
