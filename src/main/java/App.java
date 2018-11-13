
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Account Aharan = new Account(1, "Aharan", "Manoharan");
        Account Raket = new Account(2, "Raket", "Makhim");

        Service service = new Service();
        service.insertIntoHash(Aharan);
        service.insertIntoHash(Raket);

        System.out.println(service.getAccounts());
        System.out.println(service.hashMapToJSON());
    }
}
