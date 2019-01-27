package SDA;


import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Shop {

    private Deque<Person> queue = new LinkedList<>();


    public void showQueue(){
        for(Person person : queue){
            System.out.println(person);
        }
    }

    public void addClient(Person person) throws FullQueueException{
        if(queue.size()>=10) {
            throw new FullQueueException();
        }else if(person.getAge()>=18){
            queue.add(person);
        }
    }

    public void serveClient(){
        System.out.println("Klient obsluzony: " + queue.poll().toString());
    }

    public void serveVipClient(Person person){
        queue.addFirst(person);
    }


}
