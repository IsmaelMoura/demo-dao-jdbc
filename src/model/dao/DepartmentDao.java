package model.dao;

import model.entities.Deparment;

import java.util.List;

public interface DepartmentDao {
    void insert(Deparment deparment);

    void update(Deparment deparment);

    void deleteById(Integer id);

    Deparment findById(Integer id);

    List<Deparment> findAll();
}
