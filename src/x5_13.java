import java.util.Scanner;

public class x5_13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int x = s.nextInt();
        System.out.print("Введите второе число: ");
        int y = s.nextInt();
        System.out.println(x + " x " + y + " =" + x * y);
        System.out.println();
        System.out.print("Введите первое число: ");
        int z = s.nextInt();
        System.out.print("Введите второе число: ");
        int c = s.nextInt();
        System.out.print("Введите третье число: ");
        int v = s.nextInt();
        System.out.println("Среднее значение чисел = " + (x + y + z) / 3);
    }

}

