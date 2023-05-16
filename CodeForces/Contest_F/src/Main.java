import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Long x = input.nextLong();
        Long y = input.nextLong();

        char x1 =x.toString().charAt(x.toString().length()-1);
        char y1 =y.toString().charAt(y.toString().length()-1);
        x = (long) Character.getNumericValue(x1);
        y = (long) Character.getNumericValue(y1);
        System.out.println(x+y);
    }
}