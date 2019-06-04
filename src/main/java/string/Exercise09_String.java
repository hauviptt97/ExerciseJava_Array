package string;

public class Exercise09_String {

    public String compact(String input) {

        int count = 0;
        StringBuilder result = new StringBuilder();

        char current = 0;

        for (int i = 0; i < input.length() - 1; i++) {

            if (input.charAt(i) != input.charAt(i + 1)) {

                current = input.charAt(i + 1);

                if (count > 1) {
                    result.append(input.charAt(i)).append(count);
                } else {
                    result.append(input.charAt(i));
                }
                count = 0;
            }
            count++;

        }

        if (current == input.charAt(input.length() - 1)) {
            if (count > 1) {
                result.append(current).append(count);
            } else {
                result.append(current);
            }
        }

        return result.toString();
    }
}
