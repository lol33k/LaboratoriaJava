package pl.lublin.wsei.java.cwiczenia;

import java.util.Scanner;

public class Main {

    private static String leftPad(String aText, char aChar, int aWidth) {
        String res = aText;
        for (int i = 0; i < aWidth - aText.length(); i++) {
            res = aChar + res;
        }
        return res;
    }

    public static void main(String[] args) {

        /*
        //Zadanie 4
        System.out.println("Hello Java world\n");

        //Zadanie 7a
        System.out.print("Ala");
        System.out.print("ma");
        System.out.print("kota");

        //Zadanie 7b
        System.out.println("Ala");
        System.out.println("ma");
        System.out.println("kota");

        //Zadanie 7c
        System.out.print("Ala\n");
        System.out.print("ma\n");
        System.out.print("kota\n");

        int a = 3;
        float b = 4.21f;
        String s = "jakiś tekst";

        System.out.printf("a = %d, b = %.2f, s = %s %n", a, b, s);

        System.out.print("Nazywaliśmy to \"witaminą B3\"\n");

        System.out.print("alfa\tsin(alfa)\n");
        for (int i = 0; i < 370; i += 10) {
            System.out.printf("%d\t%f\t\n", i, Math.sin(i / 360.0 * 2 * Math.PI));
        }

        //Zadanie 8-9
        Scanner input = new Scanner(System.in);
        int num1=0, num2=0;
        do {
            System.out.print("Podaj liczby, które mam dodać: ");
            num1 = input.nextInt();
            num2 = input.nextInt();
            if(num1 == 0 || num2 == 0) break;
            System.out.printf("Wynik dodawania %d + %d = %d%n", num1, num2, num1 + num2);
        } while (true);
        */

        Scanner input = new Scanner(System.in);
        int dec = 0;
        do {
            System.out.print("Podaj liczbę którą mam zamienić: ");
            dec = input.nextInt();
            String hex = Integer.toHexString(dec);
            String bin = Integer.toBinaryString(dec);
            if (dec == 0) break;
            System.out.printf("DEC: %d, BIN: %s, HEX: %s\n", dec, leftPad(bin, '0', 8), leftPad(hex.toUpperCase(), '0', 4));
        } while (true);
    }
}
