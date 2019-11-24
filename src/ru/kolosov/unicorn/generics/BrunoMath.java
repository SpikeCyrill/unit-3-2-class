package ru.kolosov.unicorn.generics;

public class BrunoMath {

    public static <T extends Number> T print(T value) {
        System.out.println(value);
        return value;
    }

    public static Object printObj(Object value) {
        System.out.println(value);
        return value;
    }

}
