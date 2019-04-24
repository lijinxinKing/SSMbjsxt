package com.pojo;

public class User {
    private int id;
    private String name;
    private String price;
    private String posotion;
    private Address address;
    public User() {
    }

    public User(int id, String name, String price, String posotion, Address address, String desc) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.posotion = posotion;
        this.address = address;
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", posotion='" + posotion + '\'' +
                ", address=" + address +
                ", desc='" + desc + '\'' +
                '}';
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public User(int id, String name, String price, String posotion, String desc) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.posotion = posotion;
        this.desc = desc;
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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPosotion() {
        return posotion;
    }

    public void setPosotion(String posotion) {
        this.posotion = posotion;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    private String desc;
}
