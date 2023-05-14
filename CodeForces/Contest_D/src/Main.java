import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Long a = s.nextLong();
        Long b = s.nextLong();
        Long c = s.nextLong();
        Long d = s.nextLong();
        Long result = (a*b)-(c*d);
        System.out.println("Difference = "+ result);
    }
}