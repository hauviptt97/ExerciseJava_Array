package string;

public class Exercise14_String {

    public boolean isValidBarcode(String barcode) {
        if (barcode.length() != 13 || barcode.matches("[\\D]+")) {
            return false;
        } else {

            int sum = 0;

            for (int i = 0; i < barcode.length(); i++) {
                sum += ((i & 1) * 2 + 1) * (barcode.charAt(i) - '0');
            }

            return sum % 10 == 0;
        }
    }

}
