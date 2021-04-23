package pl.lublin.wsei.java.cwiczenia.mylib;

import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Array;
import java.util.Random;

public class StringFun {

    public static String anarchize(String txt) {
        StringBuilder txtSb = new StringBuilder(txt);
        for (int i = 0; i < txtSb.length(); i++) {
            if (Character.isUpperCase(txtSb.charAt(i))) {
                txtSb.setCharAt(i, Character.toLowerCase(txtSb.charAt(i)));
            } else if (Character.isLowerCase(txtSb.charAt(i))) {
                txtSb.setCharAt(i, Character.toUpperCase(txtSb.charAt(i)));
            }
        }
        return txtSb.toString();
    }

    public static String camelize(String txt) {
        StringBuilder txtSb = new StringBuilder(txt);
        for (int i = 0; i < txtSb.length(); i++) {
            if (Character.isWhitespace(txtSb.charAt(i))) {
                txtSb.setCharAt(i + 1, Character.toUpperCase(txtSb.charAt(i + 1)));
            }
        }
        txtSb.setCharAt(0, Character.toLowerCase(txtSb.charAt(0)));
        return txtSb.toString().replaceAll("\\s", "");
    }

    public static String decamelize(String txt) {
        StringBuilder txtSb = new StringBuilder(txt);
        for (int i = 0; i < txtSb.length(); i++) {
            if (Character.isUpperCase(txtSb.charAt(i))) {
                txtSb.replace(i, i + 1, " " + String.valueOf(txtSb.charAt(i)).toLowerCase());
            }
        }
        return txtSb.toString();
    }

    public static String decamelizeLazy(String txt) {
        String[] tab = StringUtils.splitByCharacterTypeCamelCase(txt);
        StringBuilder txtSb = new StringBuilder();
        for (int i = 0; i < Array.getLength(tab); i++) {
            if (i == Array.getLength(tab) - 1) {
                txtSb.append(tab[i]);
            } else {
                txtSb.append(tab[i]).append(" ");
            }
        }
        return txtSb.toString();
    }

    public static boolean isPalindrome(String txt) {
        txt = txt.toLowerCase();
        txt = txt.replaceAll("\\s", "");
        for (int i = 0; i < txt.length() / 2; i++) {
            if (txt.charAt(i) != txt.charAt(txt.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static String shuffle(String initialTxt) {
        Random random = new Random();
        StringBuilder initialTxtSb = new StringBuilder(initialTxt);
        StringBuilder result = new StringBuilder();
        int length = initialTxtSb.length();
        for(int i = 0; i < initialTxt.length(); i++) {
            int c = random.nextInt(length);
            result.append(initialTxtSb.charAt(c));
            initialTxtSb.deleteCharAt(c);
            length = initialTxtSb.length();
        }
        return result.toString();
    }
}
