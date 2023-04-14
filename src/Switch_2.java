import java.util.Scanner;

public class Switch_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи возраст: ");
        String age = scanner.nextLine();
        switch (age) {
            case "zero":
                System.out.println("you have borned");
                break;
            case "seven":
                System.out.println("you went to school");
                break;
            case "eighteen":
                System.out.println("you have finished school");
                break;
            default:
                System.out.println("none of the previous conditions fit");
        }
    }
}
