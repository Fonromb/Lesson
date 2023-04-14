import java.util.Scanner;

public class x11_12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Введите значение радиуса круга, мм: ");
        double x = s.nextDouble();
        System.out.println("периметр круга = " + 2*Math.PI*x);
        System.out.println("площадь круга = " + Math.PI*x*x);

        System.out.println();
        System.out.print("Введите значение длины прямоугольника, мм: ");
        double y = s.nextDouble();
        System.out.print("Введите значение ширины прямоугольника, мм: ");
        double z = s.nextDouble();
        System.out.println("периметр прямоугольника = " + 2*(y+z));
        System.out.println("площадь прямоугольника = " + y*z);
    }
}

