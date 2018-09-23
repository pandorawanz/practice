import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i = 1;
        Scanner sc = new Scanner(System.in);
        String str;
        while (true) {
            str = sc.nextLine();
            if (str.length() == 0) {
                break;
            } else {
                new OutputThread(str,i);
                i++;
            }
        }
        System.out.println("MainThread ends.");
    }
}
