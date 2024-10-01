public class Main {
    public static void main(String[] args) {
        QueueArray bingus = new QueueArray(4);
        String blingus = "blah";
        bingus.enqueue(blingus);
        bingus.enqueue("blongus");
        bingus.enqueue("borngus");
        bingus.enqueue("bringus");
        bingus.enqueue("wongus");


        bingus.display();
        bingus.display();
        System.out.println("done");
    }
}