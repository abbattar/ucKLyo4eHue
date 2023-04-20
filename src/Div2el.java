import java.util.ArrayList;
import java.util.Arrays;

public class Div2el {
    public static void main(String[] args) {
        int[] array1 = new int[]{5,10,15,25};
        // int[] array2 = new int[]{12,14,2,5,87,4};
        int[] array2 = new int[]{3,6,9,18};
        System.out.println(Arrays.toString(method2div(array1,array2)));
    }

    public static int[] method2div(int[] arr1, int[] arr2) {
        ArrayList<Integer> div2arrEl = new ArrayList<>();
        if (arr1.length != arr2.length) {
            System.out.println("Введите 2 массива одинаковой длины!");
        }
        int len = (arr1.length + arr2.length) / 2;
        for (int i = 0; i < len; i++) {
            div2arrEl.add(arr1[i] - arr2[i]);
        }
        int[] divArray = new int[div2arrEl.size()];
        for (int i = 0; i < len; i++) {
            divArray[i] = div2arrEl.get(i);
        }
        return divArray;
    }
}
