package ssm.pojo;

public class Account {
    private int id;
    private int accno;

    public Account() {
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", accno=" + accno +
                ", password=" + password +
                ", balance=" + balance +
                ", name='" + name + '\'' +
                '}';
    }

    public Account(int id, int accno, int password, double balance, String name) {
        this.id = id;
        this.accno = accno;
        this.password = password;
        this.balance = balance;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAccno() {
        return accno;
    }

    public void setAccno(int accno) {
        this.accno = accno;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int password;
    private double balance;
    private String name;

}
