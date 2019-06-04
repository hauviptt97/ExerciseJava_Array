package string;

public class Exercise12_String {

    public String compact(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length() - 1; i++) {
            if (input.charAt(i) != input.charAt(i + 1)) {
                result.append(input.charAt(i));
            }
        }
        result.append(input.charAt(input.length() - 1));
        return result.toString();
    }
}
