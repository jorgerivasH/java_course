package chapter6;

public class MonthConverter {
    public static void main(String[] args) {
        Month obj = new Month();
        System.out.println(obj.getMonth(2));
        System.out.println(Month.getMonth("January"));
    }
}
