package application;

import model.entities.Deparment;
import model.entities.Seller;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        Deparment deparment = new Deparment(1, "books");
        Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.0, deparment);

        System.out.println(deparment);
        System.out.println(seller);
    }
}
