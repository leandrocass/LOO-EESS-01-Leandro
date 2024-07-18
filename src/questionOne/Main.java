package questionOne;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner number = new Scanner(System.in);
       float x = 1, y = 1, mults;
       x = number.nextFloat();
       y = number.nextFloat();
       mults = x * y;
       System.out.println(mults);
    }
}
