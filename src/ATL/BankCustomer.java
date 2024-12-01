package ATL;

import javax.naming.InsufficientResourcesException;

public class BankCustomer extends Customer implements PaymentService {
    public BankCustomer(String name, double balance, String id) {
        super(name, balance, id);
    }
    @Override
    public void pay(double amount) throws InsufficientResourcesException, InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Ödəyəcəyiniz məbləğ müsbət olmalıdır.");
        }
        if (getBalance() < amount) {
            throw new InsufficientResourcesException("Kifayət qədər məbləğ yoxdur.");
        }
        increaseBalance(-amount);
        System.out.println(amount + " balansa uğurla köçürülmüşdür.");
    }

    @Override
    public void returnMoney(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Geri qaytarılacaq məbləğ müsbət olmalıdır.");
        }
        increaseBalance(amount);
        System.out.println(amount + "balansa uğurla köçürülmüşdür.");
    }
}
