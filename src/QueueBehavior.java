public interface QueueBehavior {
    void enqueue(String person);
    String dequeue();
    int size();
}
