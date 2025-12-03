package observer;

public class SubscriberA implements Subscriber {
    @Override
    public void update(Publisher context) {
        System.out.println("SubscriberA recebeu atualização. Estado atual: " + context.getMainState());
    }
}

