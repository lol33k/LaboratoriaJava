package pl.lublin.wsei.java.cwiczenia;

import pl.lublin.wsei.java.cwiczenia.mylib.Account;
import pl.lublin.wsei.java.cwiczenia.mylib.StringFun;
import pl.lublin.wsei.java.cwiczenia.mylib.StrongPasswordGenerator;

public class Main {

    public static void main(String[] args) {
        Account acc = new Account();
//        acc.setName("piotr Gołabek");
//        System.out.println(acc.getName());
//        System.out.printf("%s%n",Account.capitalize("stanisŁaw maruSARz"));
        System.out.printf("%s%n",Account.translit("Ян Ковалскі"));
        System.out.printf("%s%n",StringFun.anarchize("TeKsT"));
        System.out.printf("%s%n",StringFun.camelize("Krótka     zabawna    funkcja"));
        System.out.printf("%s%n",StringFun.decamelize("krótkaZabawnaFunkcja"));
        System.out.printf("%s%n",StringFun.decamelizeLazy("krótkaZabawnaFunkcja"));
        System.out.printf("%s%n",StringFun.isPalindrome("Kobyła ma mały bok"));
        System.out.printf("%s%n",StringFun.shuffle("abc"));

        //StrongPasswordGenerator
        String passwd = new StrongPasswordGenerator(12,true,true,true,true, "%#@").generate();
        System.out.printf("%s%n",passwd);
    }

}
