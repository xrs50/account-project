import org.junit.Assert;
import org.junit.Test;

public class Tests {
    PeopleFinder peopleFinder = new PeopleFinder();
    Service service = new Service();

    @Test
    public void countAharanInstances(){
        Account Aharan = new Account(1,"Aharan", "Manoharan");
        service.insertIntoHash(Aharan);
        Assert.assertEquals(1, peopleFinder.findInstancesOfFirstName("Aharan"));
    }

    @Test
    public void countManoharanInstances(){
        Account Aharan = new Account(1,"Aharan", "Manoharan");
        Account Kavin = new Account(2, "Kavin", "Manoharan");
        service.insertIntoHash(Aharan);
        service.insertIntoHash(Kavin);
        Assert.assertEquals(2, peopleFinder.findInstancesOfLastName("Manoharan"));
    }
}
