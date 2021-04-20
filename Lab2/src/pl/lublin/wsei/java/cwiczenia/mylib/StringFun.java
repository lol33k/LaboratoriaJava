package pl.lublin.wsei.java.cwiczenia.mylib;

import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Array;

public class StringFun {

    public static String anarchize(String txt) {
        StringBuilder txtSb = new StringBuilder(txt);
        for(int i = 0; i < txtSb.length(); i++) {
            if(Character.isUpperCase(txtSb.charAt(i))) {
                txtSb.setCharAt(i, Character.toLowerCase(txtSb.charAt(i)));
            }
            else if(Character.isLowerCase(txtSb.charAt(i))) {
                txtSb.setCharAt(i, Character.toUpperCase(txtSb.charAt(i)));
            }
        }
        return txtSb.toString();
    }

    public static String camelize(String txt) {
        StringBuilder txtSb = new StringBuilder(txt);
        for(int i = 0; i < txtSb.length(); i++) {
            if(Character.isWhitespace(txtSb.charAt(i))) {
                txtSb.setCharAt(i+1, Character.toUpperCase(txtSb.charAt(i+1)));
            }
        }
        txtSb.setCharAt(0,Character.toLowerCase(txtSb.charAt(0)));
        return txtSb.toString().replaceAll("\\s","");
    }

    public static String decamelize(String txt) {
        StringBuilder txtSb = new StringBuilder(txt);
        for(int i = 0; i < txtSb.length(); i++) {
            if(Character.isUpperCase(txtSb.charAt(i))) {
                txtSb.replace(i, i+1, " " + String.valueOf(txtSb.charAt(i)).toLowerCase());
            }
        }
        return txtSb.toString();
    }

    public static String decamelizeLazy(String txt) {
        String[] tab = StringUtils.splitByCharacterTypeCamelCase(txt);
        StringBuilder txtSb = new StringBuilder();
        for(int i = 0; i < Array.getLength(tab); i++) {
            if(i == Array.getLength(tab)-1) {
                txtSb.append(tab[i]);
            }
            else {
                txtSb.append(tab[i]).append(" ");
            }
        }
        return txtSb.toString();
    }
}
