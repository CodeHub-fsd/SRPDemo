package liskovprinciple;

public class PpfAccount extends BankAccount{
  //  @Override
    public boolean withdraw() {
        try{
            throw new Exception("cannot withdraw from ppf account");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
