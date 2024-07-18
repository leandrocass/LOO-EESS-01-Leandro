package questionFour;

import java.util.Scanner;

public class questionQuatro {
    public static void main(String[] args) {
        float X1, X2, X3, P1, P2, P3, mediaP;
        P1 = 2;
        P2 = 3;
        P3 = 5;
        Scanner snr = new Scanner(System.in);
        X1 = snr.nextFloat();
        X2 = snr.nextFloat();
        X3 = snr.nextFloat();
        mediaP = ((X1*P1 + X2*P2 + X3*P3)/ (P1+P2+P3));
        System.out.println(mediaP);
    }
}