package HW_2;

import java.util.Scanner;

public class EmptyString {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            String str = sc.toString();
//            if (str == null) {
//                System.out.println("Пустые строки вводить нельзя!");
//            }
            sc.close();
        } catch (NullPointerException e) {
            System.out.println("Пустые строки вводить нельзя!");
        }
    }
}
