package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
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

        System.out.println("\n=== 4TH TEST: seller insert ===");
        Seller sellerToInsert = new Seller(null, "Greg", "Greg@gmail.com", new Date(), 4000.0, department);
        sellerDao.insert(sellerToInsert);
        System.out.println("Inserted! new id = " + sellerToInsert.getId());

        System.out.println("\n=== 5TH TEST: seller update ===");
        seller = sellerDao.findById(1);
        seller.setName("Martha Waine");
        sellerDao.update(seller);
        System.out.println("Update completed");
    }
}
