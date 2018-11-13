import java.util.HashMap;

public class Service {
    private static HashMap<Integer, String> accounts = new HashMap<Integer, String>();

    public HashMap<Integer, String> getAccounts() {
        return accounts;
    }

    public void insertIntoHash(Account account){

        String firstAndLastName = account.getFirstName() +" "+ account.getLastName();
        accounts.put(account.getAccountNumber(), firstAndLastName);
    }
}
