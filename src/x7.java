import java.util.Scanner;

public class x7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Введите число: ");
        int q = s.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(q + " x " + i + " =" + (q * i));
        }
    }
}