public class Main {
    public static void main(String[] args) {
        Thread A = new TopperThread();
        Thread B = new LowerThread();
        for (int i = 1 ; i <= 100; i++) {
            System.out.print(i + ",");
        }
    }
}
