package HW_3;

public class MyExceptions extends Exception{
    public int x;
    public String yourName;
    public Throwable NotWrightSignException() throws NumberFormatException {
        if (x < 0) {
            throw new NumberFormatException("Номер телефона не может быть отрицательным числом");
        }
        return new Throwable(NotWrightSignException());
    }

    public Throwable NotFullNameException() {
        return new Throwable(NotFullNameException());
    }
}
