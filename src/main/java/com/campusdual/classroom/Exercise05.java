package com.campusdual.classroom;

public class Exercise05 {
    public static void main(String[] args) {
        // Ejemplos de uso de los métodos
        checkLessOrGreaterEqual(5, 10);
        checkLessOrGreaterEqual(15, 10);

        checkMultiply(10, 5);
        checkMultiply(10, 3);

        checkPositiveNegative(-5);
        checkPositiveNegative(0);
        checkPositiveNegative(10);
    }

    // Metodo que comprueba si n1 es menor o mayorigual que n2
    public static void checkLessOrGreaterEqual(int n1, int n2) {
        if (n1 < n2) {
            System.out.println(n1 + " es menor que " + n2);
        } else {
            System.out.println(n1 + " es mayor o igual que " + n2);
        }
    }

    // Metodo que comprueba si n1 es múltiplo de n2
    public static void checkMultiply(int n1, int n2) {
        if (n2 != 0 && n1 % n2 == 0) {
            System.out.println(n1 + " es múltiplo de " + n2);
        } else {
            System.out.println(n1 + " no es múltiplo de " + n2);
        }
    }

    // Metodo que comprueba si num es negativo o positivo
    public static void checkPositiveNegative(int num) {
        if (num < 0) {
            System.out.println(num + " es negativo.");
        } else {
            System.out.println(num + " es positivo.");
        }
    }
}
