package string;

public class Exercise08_String {

    public String standardized(String input) {

        if (input.trim().isEmpty()) {
            return input;
        }

        StringBuilder result = new StringBuilder();

        String[] lines = input.split("[.,?!]+");
        String[] signs = input.replaceAll("[^.,?!]+", " ").trim().split("[ ]+");

        for (int i = 0; i < lines.length; i++) {

            lines[i] = lines[i].trim().substring(0, 1).toUpperCase() + lines[i].trim().substring(1).toLowerCase();

            if (i < signs.length) {

                result.append(lines[i]).append(signs[i]).append(" ");

                if (signs[i].equals(",")) {
                    result.append(lines[i].toLowerCase()).append(signs[i]).append(" ");
                }

            } else {
                result.append(lines[i]).append(" ");
            }
        }

        return result.toString().trim();
    }
}
