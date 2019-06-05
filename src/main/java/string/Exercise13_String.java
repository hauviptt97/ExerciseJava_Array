package string;


public class Exercise13_String {

    public boolean isEqual(String input1, String input2) {

        System.out.println(input1.compareTo(input2));

        System.out.println(input1);
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new Exercise13_String().isEqual("cxzczcxzc", "cxzczczxc"));
    }
}
