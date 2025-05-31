package liskovprinciple;

public class WithdrawbleBankAccount extends BankAccount{

    public boolean withdraw() {
        System.out.println("withdraw allowed from bank account");
        return true;
    }
}
