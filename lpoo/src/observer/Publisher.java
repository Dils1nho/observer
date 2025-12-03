package observer;

import java.util.ArrayList;
import java.util.List;

public class Publisher {
private List<Subscriber> subscribers = new ArrayList<>();
private int mainState;

public void subscribe(Subscriber subscriber) {
subscribers.add(subscriber);
}

public void unsubscribe(Subscriber subscriber) {
subscribers.remove(subscriber);
}

public void notifySubscribers() {
for (Subscriber s : subscribers) {
s.update(this);
}
}

public void mainBusinessLogic(int newState) {
System.out.println("Executando lógica principal com novo estado: " + newState);
this.mainState = newState;
notifySubscribers();
}

public int getMainState() {
return mainState;
    }
}

