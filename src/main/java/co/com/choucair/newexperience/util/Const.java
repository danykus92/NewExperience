package co.com.choucair.newexperience.util;

import com.github.javafaker.Faker;

public class Const {
    public static final String SIZE = "L";
    public static final String EMAIL= new Faker().internet().emailAddress();
}
