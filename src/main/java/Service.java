import netscape.javascript.JSObject;
import org.json.JSONObject;

import java.util.HashMap;

public class Service {
    private static HashMap<Integer, Account> accountsHashMap = new HashMap<Integer, Account>();

    public HashMap<Integer, Account> getAccounts() {
        return accountsHashMap;
    }

    public JSONObject hashMapToJSON(){
        return new JSONObject(accountsHashMap);
    }

    public void insertIntoHash(Account account){
        accountsHashMap.put(account.getAccountNumber(), account);
    }
}
