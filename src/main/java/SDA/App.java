package SDA;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Shop shop = new Shop();
        try {
            shop.addClient(new Person("Michał", 26));
        } catch (FullQueueException e) {
            e.printStackTrace();
        }
        try {
            shop.addClient(new Person("Ewa", 22));
        } catch (FullQueueException e) {
            e.printStackTrace();
        }
        try {
            shop.addClient(new Person("Roman", 21));
        } catch (FullQueueException e) {
            e.printStackTrace();
        }
        try {
            shop.addClient(new Person("Robert", 20));
        } catch (FullQueueException e) {
            e.printStackTrace();
        }

        shop.showQueue();

        shop.serveClient();

        shop.showQueue();

        shop.serveVipClient(new Person("Roberto", 20));

        shop.showQueue();
    }
}
