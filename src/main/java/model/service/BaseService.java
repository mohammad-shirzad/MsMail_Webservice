package model.service;

import java.util.List;

public interface BaseService<T> {
    int saveEntity(T t);

    List<T> getAll();

    void deleteEntity(T t);

    List<T> getListByPhrase(String colName, String phrase);

    T getInstanceByField(String colName, String value);

    List<T> getListByField(String colName, String value);

    T getEntityById(T t, int id);
}
