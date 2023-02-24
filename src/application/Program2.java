package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {
    public static void main(String[] args) {
        DepartmentDao departmentDao = DaoFactory.createDeparmentDao();

//        System.out.println("=== 1ST TEST: department insert");
//        Department departmentToInsert = new Department(null, "Music");
//        departmentDao.insert(departmentToInsert);
//        System.out.println("Inserted! new id = " + departmentToInsert.getId());

        System.out.println("\n=== 2ND TEST: department update");
        Department departmentToUpdate = departmentDao.findById(2);
        departmentDao.update(departmentToUpdate);
        departmentToUpdate.setName("Food");
        System.out.println("Update completed");

    }
}
