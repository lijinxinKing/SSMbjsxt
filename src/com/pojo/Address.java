package com.pojo;

public class Address {
    private String pre;
    private String city;
    private String rown;

    public String getPre() {
        return pre;
    }

    @Override
    public String toString() {
        return "Address{" +
                "pre='" + pre + '\'' +
                ", city='" + city + '\'' +
                ", rown='" + rown + '\'' +
                '}';
    }

    public Address() {
    }

    public Address(String pre, String city, String rown) {
        this.pre = pre;
        this.city = city;
        this.rown = rown;
    }

    public void setPre(String pre) {
        this.pre = pre;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRown() {
        return rown;
    }

    public void setRown(String rown) {
        this.rown = rown;
    }
}
