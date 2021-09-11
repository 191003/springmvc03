package com.zking.controller.demo;

import java.util.Locale;

public class LocaleTest {

    public static void main(String[] args) {
        Locale locale = Locale.getDefault();
        System.out.println(locale);
        Locale L=  Locale.US;
        System.out.println(L);
        String[] isoCountries = Locale.getISOCountries();
        System.out.println(isoCountries.length);
        String[] isoLanguages = Locale.getISOLanguages();
        System.out.println(isoLanguages.length);


    }
}
