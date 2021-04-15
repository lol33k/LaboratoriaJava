package pl.lublin.wsei.java.cwiczenia;

public class Main {

    public static void main(String[] args) {

        //4
        System.out.println("Hello Java world\n");

        //7a
        System.out.print("Ala");
        System.out.print("ma");
        System.out.print("kota");

        //7b
        System.out.println("Ala");
        System.out.println("ma");
        System.out.println("kota");

        //7c
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
    }
}
