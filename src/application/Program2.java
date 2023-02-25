package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.List;

public class Program2 {
    public static void main(String[] args) {
        DepartmentDao departmentDao = DaoFactory.createDeparmentDao();

        System.out.println("=== 1ST TEST: department insert ===");
        Department departmentToInsert = new Department(null, "Music");
        departmentDao.insert(departmentToInsert);
        System.out.println("Inserted! new id = " + departmentToInsert.getId());

        System.out.println("\n=== 2ND TEST: department findById ===");
        Department departmentById = departmentDao.findById(2);
        System.out.println(departmentById);

        System.out.println("\n=== 3RD TEST: department update");
        Department departmentToUpdate = departmentDao.findById(2);
        departmentDao.update(departmentToUpdate);
        departmentToUpdate.setName("Food");
        System.out.println("Update completed");

        System.out.println("\n=== 4TH TEST: department deleteById ===");
        Department departmentToDelete = departmentDao.findById(8);
        departmentDao.deleteById(departmentToDelete.getId());
        System.out.println("Delete completed");

        System.out.println("\n=== 4TH TEST: department findAll ===");
        List<Department> allDepartments = departmentDao.findAll();
        allDepartments.forEach(System.out::println);
    }
}
