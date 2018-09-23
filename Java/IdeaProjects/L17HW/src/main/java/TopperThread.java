
public class TopperThread extends Thread{
    public TopperThread() {
        super();
        start();
    }

    public void run() {
        for (int i = 65; i<=90; i++) {
            System.out.print((char) i + ",");
        }
    }
}
