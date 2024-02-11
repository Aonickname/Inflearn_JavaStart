package casting;

public class Casting1 {
    public static void main(String[] args) {
        int intvalue = 10;
        long longvalue;
        double doublevalue;

        longvalue = intvalue;
        System.out.println("LongValue = " + longvalue);

        doublevalue = intvalue;
        System.out.println("doublevalue = " + doublevalue);

        doublevalue= intvalue;
        System.out.println("doublevalue = " + doublevalue);



    }
}
