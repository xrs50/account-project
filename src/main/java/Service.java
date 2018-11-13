import java.util.HashMap;

public class Service {
    private static HashMap<Integer, String> accounts = new HashMap<Integer, String>();

    public HashMap<Integer, String> getAccounts() {
        return accounts;
    }

    public void setAccounts(HashMap<Integer, String> accounts) {
        this.accounts = accounts;
    }

    public void insertIntoHash(int accountNumber,  String firstName, String lastName){
        String firstAndLastName = firstName +" "+ lastName;
        accounts.put(accountNumber, firstAndLastName);

    }
}
