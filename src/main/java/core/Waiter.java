package core;

public class Waiter {

    public static void waitFor(int waitInSeconds){
        try {
            Thread.sleep(waitInSeconds * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
