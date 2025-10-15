package calculator;

import java.util.List;

public class Calculator {

    private final StringParser parser;

    public Calculator(Separator separator) {
        parser = new StringParser(separator);
    }

    public int calculate(String expression) {
        List<Integer> integers = parser.parseNumbers(expression);
        int sum = 0;
        for (Integer number : integers) {
            sum += number;
        }
        return sum;
    }
}
