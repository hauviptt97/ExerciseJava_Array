package string;

public class Exercise15_String {

    public int getVerifyNumber(String barcode) {

        if (!barcode.matches("[\\d]{12}")) {
            return -1;
        } else {

            int sum = 0;

            for (int i = 0; i < barcode.length(); i++) {
                sum += ((i & 1) * 2 + 1) * (barcode.charAt(i) - '0');
            }

            return (sum / 10 + 1) * 10 - sum;
        }
    }

}
