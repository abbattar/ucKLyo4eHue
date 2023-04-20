 import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ZaDaHue1 {
    public static void main(String[] args) {
        Scanner iScan = new Scanner(System.in);
        int sc = iScan.nextInt();
        method1(sc);
        method3(sc);
        iScan.close();
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        System.out.println(method2(arr));
    }

    public static void method1(int m1) {
        if (m1 != 4) {
            System.out.println("Нельзя!");
        }
    /*
    if (m1 == "4") {
            System.out.println("Нет!");
        }
        if (m1 = 4.0) {
            System.out.println("Не надо так!");
        }

         */
    }

    private static HashMap<Integer, String> method2(int[] m2) {
        ArrayList<Integer> intList = new ArrayList<>();
        String str;
        HashMap<Integer, String> hm = new HashMap<>();
        for (int i = 0; i < m2.length; i++) {
            if (m2[i] > 10) {
                str = String.format("%d in", i);
            } else {
                str = String.format("%d out", "i"); // !! Исключение !!
            }
            intList.add(m2[i]);
            hm.put(intList.get(i), str);
        }
        return hm;
    }

    private static double method3(int i) {
        if (i%10 != 0) {
            return (i%2)/3;
        } else {
            return i/10;
        }
        // return 0; // !! Забыл убрать заглушку !!
    }
}