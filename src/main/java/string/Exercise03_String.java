package string;

public class Exercise03_String {

    public boolean isRevertString(String input) {

        if (input.trim().isEmpty()) {
            return false;
        }

        int n = input.length();

        for (int i = 0; i < n / 2; i++) {
            if (input.charAt(i) != input.charAt(n - i - 1)) {
                return false;
            }
        }

        return true;
    }
}