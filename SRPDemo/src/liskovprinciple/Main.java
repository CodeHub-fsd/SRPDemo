package liskovprinciple;

public class Main {
    public static void main(String[] args){
        WithdrawbleBankAccount correntBankAccount=new CurrentBankAccount();
        WithdrawbleBankAccount savingBankAccount=new SavingBankAccount();
        BankAccount ppfAccount=new PpfAccount();
        correntBankAccount.openAccount("Current account: ");
        correntBankAccount.withdraw();

        savingBankAccount.openAccount("Saving account: ");
        savingBankAccount.withdraw();

     //   ppfAccount.openAccount("open account");
        ppfAccount.openAccount("ppf account: ");
    }





}
