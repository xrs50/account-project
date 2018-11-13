import java.util.Map;

public class PeopleFinder {
    Service service = new Service();

    public int findInstancesOfFirstName(String firstName) {
        int count = 0;
        for (Map.Entry<Integer, Account> pair:  service.getAccounts().entrySet()) {
            if(pair.getValue().getFirstName().equals(firstName)){
                count ++;
            }
        }
        return count;
    }

    public int findInstancesOfLastName(String lastName) {
        int count = 0;
        for (Map.Entry<Integer, Account> pair: service.getAccounts().entrySet()) {
            if(pair.getValue().getLastName().equals(lastName)){
                count ++;
            }
        }
        return count;
    }

    public int findInstancesOfNameWithStreams(String name){

        return (int)service.getAccounts().values().stream().filter(account -> account.getLastName().equals(name) || account.getFirstName().equals(name)).count();
    }
}
