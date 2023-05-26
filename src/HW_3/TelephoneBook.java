package HW_3;

import java.io.CharConversionException;
import java.io.FileWriter;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Scanner;

import static HW_3.Getters.*;

public class TelephoneBook {
    public static void main(String[] args) throws MyExceptions {
        try (Scanner count = new Scanner(System.in);
             Scanner scName = new Scanner(System.in);
             Scanner scMale = new Scanner(System.in);
             Scanner scBirthday = new Scanner(System.in);
             Scanner scTlphNumber = new Scanner(System.in);
             Formatter f = new Formatter();
             FileWriter fw = new FileWriter(String.valueOf(f.format("%s.txt" )))) {
            HashMap<Integer, String> fileMap = new HashMap<>();
            System.out.println("Введите Вашу Фамилию, Имя, Отчество: ");
            getName(scName.nextLine());
            System.out.println("Введите пол: m или f: ");
            getMale(scMale.next().charAt(0));
            System.out.println("Введите дату рождения в формате дд-мм-гггг: ");
            getBirthday(LocalDate.parse(scBirthday.next()));
            System.out.println("Введите № телефона: ");
            getPhoneNumber(scTlphNumber.nextInt());
            System.out.println("Введите количество записей в телефонной книжке: ");
            int countUsers = count.nextInt();
            if (scTlphNumber.nextInt() < 0) {
                throw new MyExceptions().NotWrightSignException();
            }

            int step = 0;
            for (int i = 0; i < countUsers; i++) {
                fileMap.put(i + step, getName(scName.nextLine()));
                fileMap.put(i + 1 + step, getMale(scMale.next().charAt(0)));
                fileMap.put(i + 2 + step, getBirthday(LocalDate.parse(scBirthday.next())));
                fileMap.put(i + 3 + step, getPhoneNumber(scTlphNumber.nextInt()));
                step += 4;
            }
            
            if (fileMap.containsValue(getName(scName.nextLine().split(" ")[0]))) {
                fw.write(fileMap.toString());
            }
                fw.write(fileMap.toString());
        } catch (MyExceptions | DateTimeException | CharConversionException e) {
            e.getMessage();

        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
