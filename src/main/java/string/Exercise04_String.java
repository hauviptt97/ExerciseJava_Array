package string;

import java.util.Arrays;

public class Exercise04_String {

    public int sum(String input) {

        if (!input.trim().isEmpty()) {
            input= input.replaceAll("[\\D]"," ").trim();
            String[] temp = input.split("[ ]+");
            return Arrays.stream(temp).mapToInt(Integer::parseInt).sum();
        }

        return 0;
    }
}