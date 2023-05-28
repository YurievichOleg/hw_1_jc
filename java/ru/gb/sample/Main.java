package ru.gb.sample;

import ru.gb.regular.OtherClass;

public class Main {
    public static void main(String[] args) {

        System.out.println(OtherClass.decorate(OtherClass.add(333, 555)));
    }
}