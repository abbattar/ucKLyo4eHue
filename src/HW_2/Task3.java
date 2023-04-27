package HW_2;

import java.io.FileNotFoundException;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        try {
            int a= 90;
            int b=3;
            System.out.println(a/b);
            printSum(23, 234);
            int[] abc = {1,2};
            List.of(abc).add(3, new int[]{3});
       } catch (IndexOutOfBoundsException e){
            System.out.println("Слишком большой массив! ");;
            // e.getMessage();
        } catch (NullPointerException e) {
            System.out.println("Указатель не null!");
            //e.getMessage();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (Throwable tr) {
            System.out.println("Что то пошло не так ...");
        }
    }

    public static void printSum(Integer a, Integer b) throws FileNotFoundException {
        System.out.println(a + b);
    }
}
