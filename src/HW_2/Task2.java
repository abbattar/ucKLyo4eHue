package HW_2;

public class Task2 {
    try {
        int d = 0;
        double catchedRes1 = intArrey[8] / d;   // Допустим intArray[8] элемент одномерного массива типа int
                                                                       // тогда выпадает ArithmeticException, что мы видим дальше,
                                                                        // но лучше избавиться, если это возможно, от магической цифры 8 и d != 0
    } catch (ArithmeticException ex) {
        System.out.println(ex.getMessage());
    }
}
