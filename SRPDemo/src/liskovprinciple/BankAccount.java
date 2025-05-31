package liskovprinciple;

public abstract class BankAccount {
    boolean openAccount(String accountName){
        System.out.println(accountName+"Account opened");
        return true;
    }
}
