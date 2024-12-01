package ATL;

import javax.naming.InsufficientResourcesException;

public abstract class Customer {
    private String name;
    private double balance;
    private String id;

    public Customer(String name, double balance, String id) {
        this.name = name;
        this.balance = balance;
        this.id = id;
    }
    public double getBalance() {
        return balance;
    }
    public void increaseBalance(double amount) throws InvalidAmountException {
        if (amount <= 0)  {
            throw new InvalidAmountException("Məbləğ müsbət olmalıdır!");
        }
        this.balance += amount;
    }
    public void checkBalance() {
        System.out.println("Müştərinin balansı: " + name + ": " + balance);
    }

    public abstract void pay(double amount) throws InsufficientResourcesException, InvalidAmountException;

    public abstract void returnMoney(double amount) throws InvalidAmountException;
}
