package pl.lublin.wsei.java.cwiczenia.mylib;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Locale;

public class StrongPasswordGenerator {
    private boolean maleLitery,
            duzeLitery,
            cyfry,
            znakiSpecjalne;

    int dlugosc;
    String dozwoloneZnakiSpecjalne;


    public StrongPasswordGenerator() {
        this.maleLitery = false;
        this.duzeLitery = false;
        this.cyfry = false;
        this.znakiSpecjalne = false;
        this.dlugosc = 12;
        this.dozwoloneZnakiSpecjalne = "@!#$%^&*()_+";
    }

    public StrongPasswordGenerator(boolean maleLitery, boolean duzeLitery, boolean cyfry, boolean znakiSpecjalne, String dozwoloneZnakiSpecjalne) {
        this.dlugosc = 12;
        this.maleLitery = maleLitery;
        this.duzeLitery = duzeLitery;
        this.cyfry = cyfry;
        this.znakiSpecjalne = znakiSpecjalne;
        this.dozwoloneZnakiSpecjalne = dozwoloneZnakiSpecjalne;
    }

    public StrongPasswordGenerator(int dlugosc, boolean maleLitery, boolean duzeLitery, boolean cyfry, boolean znakiSpecjalne, String dozwoloneZnakiSpecjalne) {
        this.dlugosc = dlugosc;
        this.maleLitery = maleLitery;
        this.duzeLitery = duzeLitery;
        this.cyfry = cyfry;
        this.znakiSpecjalne = znakiSpecjalne;
        this.dozwoloneZnakiSpecjalne = dozwoloneZnakiSpecjalne;
    }

    public boolean getMaleLitery() {
        return this.maleLitery;
    }

    public void setMaleLitery(boolean maleLitery) {
        this.maleLitery = maleLitery;
    }

    public boolean getDuzeLitery() {
        return this.duzeLitery;
    }

    public void setDuzeLitery(boolean duzeLitery) {
        this.duzeLitery = duzeLitery;
    }

    public boolean getCyfry() {
        return this.cyfry;
    }

    public void setCyfry(boolean cyfry) {
        this.cyfry = cyfry;
    }

    public boolean getZnakiSpecjalne() {
        return this.znakiSpecjalne;
    }

    public void setZnakiSpecjalne(boolean znakiSpecjalne) {
        this.znakiSpecjalne = znakiSpecjalne;
    }

    public int getDlugosc() {
        return dlugosc;
    }

    public void setDlugosc(int dlugosc) {
        this.dlugosc = dlugosc;
    }

    public String generate() {
        String result = "";
        String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String num = "0123456789";
        StringBuilder allowed = new StringBuilder();

        if (maleLitery) {
            allowed.append(abc.toLowerCase());
        }

        if (duzeLitery) {
            allowed.append(abc);
        }

        if (cyfry) {
            allowed.append(num);
        }

        if (znakiSpecjalne) {
            allowed.append(dozwoloneZnakiSpecjalne);
        }

        result = RandomStringUtils.random(dlugosc, allowed.toString());
        return result;
    }
}
