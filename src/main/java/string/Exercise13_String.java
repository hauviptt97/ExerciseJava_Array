package string;


public class Exercise13_String {

    public boolean isEqual(String input1, String input2) {

        String str1 = input1.toLowerCase();
        String str2 = input2.toLowerCase();

        if (input1.length() != input2.length()) {
            return false;
        }

        int indexEq;

        for (int i = 0; i < str2.length(); i++) {

            indexEq = str1.indexOf(str2.charAt(i));

            if (indexEq == -1) {
                return false;
            }

            str1 = str1.replace(str2.charAt(i), ' ');
            str2 = str2.replace(str2.charAt(i), ' ');
        }

        return str1.equals(str2);
    }
}
