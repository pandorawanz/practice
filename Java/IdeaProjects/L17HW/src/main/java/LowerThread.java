public class LowerThread extends Thread{
    public LowerThread() {
        super();
        start();
    }

    public void run() {
        for (int i = 97; i <= 122; i++) {
            System.out.print((char) i + ",");
        }
    }
}

