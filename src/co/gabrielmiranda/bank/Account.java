package co.gabrielmiranda.bank;

public class Account {

    private String ag;
    private String cc;
    private String name;
    private double balance;

    private static final int MAX_LENGTH = 12;

    public Account(String ag, String cc, String name) {
        this.ag = ag;
        this.cc = cc;
        setName(name);
    }

    public void setName(String name) {
        if (name.length() > MAX_LENGTH) {
            this.name = name.substring(0, MAX_LENGTH);
        } else {
            this.name = name;
        }
    }

    public void deposit(double value) {
        balance += value;
    }

    public boolean withDraw(double value) {
        if (balance < value) {
            return false;
        }
        balance -= value;
        System.out.println("valor a retirar: " + value + ", total na conta agora é: " + balance);
        return true;
    }

}
