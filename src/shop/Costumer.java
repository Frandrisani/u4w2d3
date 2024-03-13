package shop;

public class Costumer {
    private long id;
    private String name;
    private Integer tier;

public Costumer( String name, Integer tier) {
        this.id = Math.round(Math.random() * 100000000);
        this.name =name;
        this.tier =tier;
}

public long getId() {
    return id;
}

public String getName() {
    return name;
}

public Integer getTier() {
    return tier;
}

    @Override
    public String toString() {
        return "Costumer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tier=" + tier +
                '}';
    }
}
