package observer;

public class SubscriberB implements Subscriber {
@Override
public void update(Publisher context) {
System.out.println("SubscriberB recebeu atualização. Estado atual: " + context.getMainState());
    }
}
