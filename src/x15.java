public class x15 {
    public static void main(String[] args) {
        int a, b, temp;
        a = 15;
        b = 27;
        System.out.println("перед заменой : a, b = "+a+", "+ b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("после замены : a, b = "+a+", "+ b);
    }
}
