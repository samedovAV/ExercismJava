import java.util.GregorianCalendar;
class Leap {

    boolean isLeapYear(int year) {
        GregorianCalendar cal = (GregorianCalendar) GregorianCalendar.getInstance();

        return cal.isLeapYear(year);
    }

}
