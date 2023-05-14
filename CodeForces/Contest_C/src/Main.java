import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Long x = s.nextLong();
        Long y = s.nextLong();
        System.out.println(x+" + "+y+" = "+(x+y));
        System.out.println(x+" * "+y+" = "+(x*y));
        System.out.println(x+" - "+y+" = "+(x-y));
    }
}