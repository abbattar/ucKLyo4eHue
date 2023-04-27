package HW_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RepeatRequest {

    public static void main(String[] args) {
        repeatRequest();
    }

    private static float  repeatRequest() {
        Scanner sc = new Scanner(System.in);
        float fl;
        try {
        System.out.println("Введите дробное число: ");
        fl = sc.nextFloat();
        } catch (InputMismatchException e1) {
            System.out.println("Нужно ввести число! Вводите: ");
            fl = new Scanner(System.in).nextFloat();
        } finally {
            sc.close();
        }
        return fl;
    }
}
