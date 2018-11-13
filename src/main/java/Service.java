import netscape.javascript.JSObject;
import org.json.JSONObject;

import java.util.HashMap;

public class Service {
    private static HashMap<Integer, Account> accounts = new HashMap<Integer, Account>();

    public HashMap<Integer, Account> getAccounts() {
        return accounts;
    }

    public JSONObject hashMapToJSON(){
        return new JSONObject(accounts);
    }

    public void insertIntoHash(Account account){
        accounts.put(account.getAccountNumber(), account);
    }
}
