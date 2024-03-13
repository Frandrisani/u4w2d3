package shop;

public class Product {

    // attributes
    private Long id;
    private String name;
    private String category;
    private Double price;

    // constructor
public Product( String name, String category, Double price) {
        this.id = Math.round(Math.random() * 100000000);
        this.name =name;
        this.category =category;
        this.price =price;
}

// getters and setters
public Long getId() {
    return id;
}

public String getName() {
    return name;
}

public String getCategory() {
    return category;
}

public Double getPrice() {
    return price;
}

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}
