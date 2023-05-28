package ru.gb.regular;

/**
 * Класс для сложения двух чисел типа integer
 */
public class OtherClass {
    /**
     * 
     * @param a целое число
     * @param b целое число
     * @return сумма a и b
     */
    public static int add(int a, int b) {
        return a + b;
    }

    /**
     * 
     * @param a целое число
     * @return строка
     */
    public static String decorate(int a) {
        return String.format("The final number %d", a);
    }
}
