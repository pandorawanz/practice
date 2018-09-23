import java.io.*;

public class OutputThread extends Thread{
    private int i;
    private String str;

    public OutputThread(String str, int i) {
        super();
        this.str = str;
        this.i = i;
        start();
    }

    public void run() {
        try {
            PrintStream print = new PrintStream(new FileOutputStream(String.valueOf(i) + ".txt"));
            print.println(str);
            print.close();
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFound.");
        }
    }
}
