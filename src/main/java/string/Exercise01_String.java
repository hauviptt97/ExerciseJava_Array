package string;

public class Exercise01_String {

    public String[] getLines(String input) {

        if (!input.trim().isEmpty()) {
            return input.split("[.?!\n]+");
        }

        return null;
    }

}