import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи возраст: ");
        int age = scanner.nextInt();
       switch (age){
           case 0:
               System.out.println("you have borned");
               break;
           case 7:
               System.out.println("you went to school");
               break;
           case 18:
               System.out.println("you have finished school");
               break;
           default:
               System.out.println("none of the previous conditions fit");
    }
    }
}
