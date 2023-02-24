package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.List;

public class Program {
    public static void main(String[] args) {
        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("===  1ST TEST: seller findById ===");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("\n=== 2ND TEST: seller findByDepartment ===");
        Department department = new Department(2, null);
        List<Seller> sellers = sellerDao.findByDepartment(department);

        sellers.forEach(System.out::println);

        System.out.println("\n=== 3RD TEST: seller findAll ===");
        sellers = sellerDao.findAll();

        sellers.forEach(System.out::println);
    }
}
