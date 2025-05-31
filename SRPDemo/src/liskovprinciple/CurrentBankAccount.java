package liskovprinciple;

public class CurrentBankAccount extends WithdrawbleBankAccount{

    @Override
    public boolean withdraw() {
        System.out.println("withdraw from current bank account");

        return true;
    }
}
