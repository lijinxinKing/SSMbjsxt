package ssm.pojo;

public class Flower {
    private int id;
    private String name;
    private Double price;

    public Flower() {
    }

    @Override
    public String toString() {
        return "Flower{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", proction='" + proction + '\'' +
                '}';
    }

    public Flower(int id, String name, Double price, String proction) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.proction = proction;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getProction() {
        return proction;
    }

    public void setProction(String proction) {
        this.proction = proction;
    }

    private String proction;

}
