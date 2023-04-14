import java.util.Scanner;

public class x6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int x = s.nextInt();
        System.out.print("Введите второе число: ");
        int y = s.nextInt();
        System.out.println(x + " + " + y + " =" + (x + y));
        System.out.println(x + " - " + y + " =" + (x - y));
        System.out.println(x + " x " + y + " =" + x * y);
        System.out.println(x + " : " + y + " =" + x/y);
        System.out.println(x + " мод " + y + " =" + x % y);
    }
}
