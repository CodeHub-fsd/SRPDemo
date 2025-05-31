package liskovprinciple;

public class SavingBankAccount extends WithdrawbleBankAccount{
    @Override
    public boolean withdraw() {
        System.out.println("withdraw from saving bank account");
        return true;
    }
}
