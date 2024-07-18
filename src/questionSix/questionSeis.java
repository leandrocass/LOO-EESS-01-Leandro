package questionSix;

import java.util.Scanner;

public class questionSeis {
    public static void main(String[] args) {
        int A, B, C, R, S;
        float D;
        Scanner snr = new Scanner(System.in);
        A = snr.nextInt();
        B = snr.nextInt();
        C = snr.nextInt();
        R = (A + B) * (A + B);
        S = (B + C) * (B + C) ;
        D = ( float) (R + S)/2;
        System.out.println(D);
    }
}