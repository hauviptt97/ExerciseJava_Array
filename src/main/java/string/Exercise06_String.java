package string;

public class Exercise06_String {
    public String convert(String input) {

        if (!input.trim().isEmpty()) {

            StringBuilder result = new StringBuilder();

            for (int i = 0; i < input.length(); i++) {
                if (Character.isUpperCase(input.charAt(i))) {
                    result.append(Character.toLowerCase(input.charAt(i)));
                } else {
                    result.append(Character.toUpperCase(input.charAt(i)));
                }
            }

            return result.toString();
        }

        return "";
    }
}