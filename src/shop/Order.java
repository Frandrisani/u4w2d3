package shop;
import java.time.LocalDate;
import java.util.List;

public class Order {
    // Attributes
    private Long id;
    private String status;
    private LocalDate date;
    private LocalDate deliveryDate;
    private List<Product> products;
    private Costumer customer;

    // Constructor
    public Order( String status, LocalDate date, LocalDate deliveryDate, List<Product> products, Costumer customer) {
        this.id = Math.round(Math.random() * 100000000);
        this.status = status;
        this.date = date;
        this.deliveryDate = deliveryDate;
        this.products = products;
        this.customer = customer;
    }

    // Getters and setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Costumer getCustomer() {
        return customer;
    }

    public void setCustomer(Costumer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", status='" + status + '\'' +
                ", date=" + date +
                ", deliveryDate=" + deliveryDate +
                ", products=" + products +
                ", customer=" + customer +
                '}';
    }
}
