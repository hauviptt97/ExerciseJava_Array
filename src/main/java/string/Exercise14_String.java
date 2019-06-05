package string;

public class Exercise14_String {

    public boolean isValidBarcode(String barcode) {
        if (barcode.length() != 13 || barcode.matches("\\D+")) {
            return false;
        }

        int sum = 0;

        for (int i = 0; i < barcode.length(); i++) {
            sum += ((i & 1) * 2 + 1) * Character.getNumericValue(barcode.charAt(i));
        }

        return sum % 10 == 0;
    }

}
