package HW_3;

import java.time.LocalDate;

public class Getters {

    public static String getName(String familNameFatherName) throws Throwable {
        String yourName;
        yourName = familNameFatherName;
        if (yourName.split(" ").length != 3) {
            throw new MyExceptions().NotFullNameException();
        } else return yourName;
    }

    public static String getBirthday(LocalDate birthday) {
        return birthday.toString();
    }

    public static String getPhoneNumber(Integer phoneNumber) {
        return  phoneNumber.toString();
    }

    public static String getMale(char gender) {
        if (gender == 'm' || gender == 'f') {
            return String.valueOf(gender);
        } else return null;
    }
}
