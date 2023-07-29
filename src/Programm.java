public class Programm {
    public static void main(String[] args) {
        Book b1 = new Book("Java. Complete Referense.", "H. Shildt");
        b1.print();
    }
}
class Book implements Printable{
    String name;
    String author;

    Book(String name, String author){
        this.name = name;
        this.author = author;
    }

    public void print() {
        System.out.printf("%s (%s) \n", name, author);
    }
}



