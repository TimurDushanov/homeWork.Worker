public class Main {
    public static void main(String[] args) {
        OnTaskDoneListener listener = System.out::println;
        OnTaskErrorListener errorListener = System.out::println;

        Worker1 worker1 = new Worker1(listener, errorListener);
        worker1.start();
    }

}