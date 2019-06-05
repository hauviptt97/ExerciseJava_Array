package string;

public class Exercise15_String {

    public int getVerifyNumber(String barcode) {

        if (barcode.length() != 12 || barcode.matches("[\\D]+")) {
            return -1;
        }

        int sum = 0;

        for (int i = 0; i < barcode.length(); i++) {
            sum += ((i & 1) * 2 + 1) * Character.getNumericValue(barcode.charAt(i));
        }

        return (sum / 10 + 1) * 10 - sum;
    }

}
