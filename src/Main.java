import shop.Costumer;
import shop.Order;
import shop.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Creazione di alcuni prodotti
        List<Product> products = new ArrayList<>();
        products.add(new Product( "Libricino", "Books", 20.0));
        products.add(new Product( "Giochino", "Baby", 40.0));
        products.add(new Product( "Librone", "Books", 250.0));
        products.add(new Product( "Videogioco", "Boys", 50.0));
        products.add(new Product( "Libretto", "Books", 170.0));
        products.add(new Product( "PC", "Boys", 900.0));
        products.add(new Product( "Giocone", "Baby", 400.0));

        // Creazione di alcuni clienti
        List<Costumer> customers = new ArrayList<>();
        customers.add(new Costumer("Franco", 2));
        customers.add(new Costumer( "Luca", 1));
        customers.add(new Costumer( "Gina", 1));
        customers.add(new Costumer( "Lucia", 2));
        customers.add(new Costumer( "Samantha", 1));
        customers.add(new Costumer( "Gianni", 2));

        // Creazione di alcuni ordini
        List<Order> orders = new ArrayList<>();
        orders.add(new Order( "COMPLETED", LocalDate.of(2021, 3, 1), LocalDate.of(2021, 3, 5), List.of(products.get(0)), customers.get(1)));
        orders.add(new Order( "COMPLETED", LocalDate.of(2021, 2, 15), LocalDate.of(2021, 2, 20), List.of(products.get(1)), customers.get(2)));
        orders.add(new Order( "COMPLETED", LocalDate.of(2021, 3, 20), LocalDate.of(2021, 3, 25), List.of(products.get(2)), customers.get(0)));
        orders.add(new Order( "COMPLETED", LocalDate.of(2021, 3, 20), LocalDate.of(2021, 3, 25), List.of(products.get(2)), customers.get(3)));
        orders.add(new Order( "COMPLETED", LocalDate.of(2021, 3, 20), LocalDate.of(2021, 3, 25), List.of(products.get(2)), customers.get(4)));
        orders.add(new Order( "COMPLETED", LocalDate.of(2021, 3, 20), LocalDate.of(2021, 3, 25), List.of(products.get(2)), customers.get(5)));
        orders.add(new Order( "COMPLETED", LocalDate.of(2021, 3, 20), LocalDate.of(2021, 3, 25), List.of(products.get(2)), customers.get(2)));


        Scanner scanner = new Scanner(System.in);
        System.out.println("Quale esercizio vuoi eseguire? 1 / 2 / 3 / 4 ?" );
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Esercizio 1");
                List<Product> booksOver100 = products.stream()
                        .filter(p -> p.getCategory().equals("Books") && p.getPrice() > 100)
                        .toList();
                System.out.println("I libri trovati sono: "+booksOver100.size() + " e sono: "+booksOver100);
            break;
            case 2:
                System.out.println("Esercizio 2");
                List<Order> categoriaBaby = orders.stream().filter(element -> element.getProducts().get(0).getCategory().equals("Baby")).toList();
                System.out.println("I prodotti per categoria Baby sono: "+categoriaBaby.size() + " e sono: "+categoriaBaby);
                break;
            case 3:
                System.out.println("Esercizio 3");
                break;
            case 4:
                System.out.println("Esercizio 4");
                break;
            default:
                System.out.println("Scelta non valida");
                break;
        }
    }


}
