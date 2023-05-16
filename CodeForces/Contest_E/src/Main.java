import java.text.DecimalFormat;
import java.util.Scanner;

import static java.lang.Math.PI;

public class Main {
    public static void main(String[] args) {
        double pi = PI;

        Scanner input = new Scanner(System.in);
        double r = input.nextDouble();
        Double area = Math.pow(r,2)*pi;
        DecimalFormat df = new DecimalFormat("#.#########");
        String formatted = df.format(area);
        System.out.println(formatted);
    }
}