package application;

import model.entities.Deparment;

public class Program {
    public static void main(String[] args) {
        Deparment deparment = new Deparment(1, "books");

        System.out.println(deparment);
    }
}
