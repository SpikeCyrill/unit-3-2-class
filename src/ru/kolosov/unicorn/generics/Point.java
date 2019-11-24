package ru.kolosov.unicorn.generics;

public class Point<T> {

    T x;
    T y;

    public Point(T x, T y) {
        this.x = x;
        this.y = y;
    }

    public <M> M calcSomething(M value) {
        System.out.println(value);
        return value;
    }

}
