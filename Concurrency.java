import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Concurrency {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Runnable task1 = new Task("Task 1");
        Runnable task2 = new Task("Task 2");

        System.out.println("Starting Executor");
        executor.submit(task1);
        executor.submit(task2);

        executor.shutdown();
    }
}

class Task implements Runnable {
    private String name;
    public Task(String name) {
        this.name = name;
    }
    public void run() {
        System.out.println("Task" + name + " is running on Thread " + Thread.currentThread().getName());
    }
}
