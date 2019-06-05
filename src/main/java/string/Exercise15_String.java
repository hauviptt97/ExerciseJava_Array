package string;

public class Exercise15_String {

    public boolean isValidBarcode(String barcode) {
        if (barcode.length() != 13){
            return false;
        }

        int sum = 0;

        for (int i = 0; i < barcode.length(); i++) {
            sum += ((i & 1) * 2 + 1) * Character.getNumericValue(barcode.charAt(i));
        }

        return sum % 10 == 0;
    }

    public int getVerifyNumber(String barcode) {

        if (barcode.length() != 12) {
            return -1;
        }

        int sum = 0;

        for (int i = 0; i < barcode.length(); i++) {
            sum += ((i & 1) * 2 + 1) * Character.getNumericValue(barcode.charAt(i));
        }

        return (sum / 10 + 1) * 10 - sum;
    }

}
