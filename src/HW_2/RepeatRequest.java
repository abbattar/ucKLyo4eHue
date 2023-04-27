package HW_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RepeatRequest {

    public static void main(String[] args) {
        repeatRequest();
    }

    private static float repeatRequest() {
        Scanner sc;
        float fl;
        try {
            sc = new Scanner(System.in);
            System.out.println("Введите дробное число: ");
            fl = sc.nextFloat();
        } catch (InputMismatchException e1) {
            do {
                sc = new Scanner(System.in);
                System.out.println("Нужно ввести число! Вводите: ");
            } while (!sc.hasNextFloat());
            fl = sc.nextFloat();
        }
        return fl;
    }
}
