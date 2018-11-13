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

    @Test
    public void countInstanceOfNameByStreamTest(){
        Account Aharan = new Account(1,"Aharan", "Manoharan");
        Account Kavin = new Account(2, "Kavin", "Manoharan");
        Account Manoharan = new Account(3, "Manoharan", "Gnanasundaram");
        service.insertIntoHash(Aharan);
        service.insertIntoHash(Kavin);
        service.insertIntoHash(Manoharan);
        Assert.assertEquals(3, peopleFinder.findInstancesOfNameWithStreams("Manoharan"));
    }
}
