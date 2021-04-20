package pl.lublin.wsei.java.cwiczenia;

import pl.lublin.wsei.java.cwiczenia.mylib.Account;
import pl.lublin.wsei.java.cwiczenia.mylib.StringFun;

public class Main {

    public static void main(String[] args) {
        Account acc = new Account();
//        acc.setName("piotr Gołabek");
//        System.out.println(acc.getName());
//        System.out.printf("%s%n",Account.capitalize("stanisŁaw maruSARz"));
        System.out.printf("%s%n",Account.translit("Ян Ковалскі"));
        System.out.print(StringFun.anarchize("TeKsT") + "\n");
        System.out.print(StringFun.camelize("Krótka     zabawna    funkcja") + "\n");
        System.out.print(StringFun.decamelize("krótkaZabawnaFunkcja") + "\n");
        System.out.print(StringFun.decamelizeLazy("krótkaZabawnaFunkcja") + "\n");
    }

}
