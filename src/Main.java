
public class Main {
    public static void main(String[] args) {
        Market market = new Market();

        market.enqueue("Петр");
        market.enqueue("Анна");
        market.enqueue("Иван");

        market.dequeue();

        market.addOrder("Яблоки");
        market.addOrder("Молоко");

        market.update();
        market.size();
        market.removeOrder("2");
    }
}