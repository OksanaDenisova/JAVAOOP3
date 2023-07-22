
import java.util.ArrayList;
import java.util.List;


public class Market implements MarketBehaviour, QueueBehavior {

    private List<String> queue;  // Очередь людей в магазине
    private List<String> orders; // Список заказов

    public Market() {
        this.queue = new ArrayList<>();
        this.orders = new ArrayList<>();
    }

    public void enqueue(String person) {
        queue.add(person);
        System.out.println(person + " добавлен в очередь.");
    }

    public String dequeue() {
        if (!queue.isEmpty()) {
            String person = queue.remove(0);
            System.out.println(person + " удален из очереди.");
        } else {
            System.out.println("Очередь пустая.");
        }
        return null;
    }

    public void update() {
        // Принять и обработать заказы
        for (String order : orders) {
            System.out.println("Принят заказ: " + order);
            // ... Обработка заказа ...
            System.out.println("Заказ " + order + " обработан.");
        }

        // Отдать заказы
        orders.clear();
        System.out.println("Заказы отданы.");
    }

    public void addOrder(String order) {
        orders.add(order);
        System.out.println("Добавлен заказ: " + order);
    }

    public void removeOrder(String order) {
        if (orders.contains(order)) {
            orders.remove(order);
            System.out.println("Заказ " + order + " удален.");
        } else {
            System.out.println("Заказ " + order + " не найден.");
        }
    }

    @Override
    public int size() {
        return queue.size();
    }
}

