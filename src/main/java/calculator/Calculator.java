package calculator;

import java.util.List;

public class Calculator {

    private final Separator separator;

    public Calculator(Separator separator) {
        this.separator = separator;
    }

    public int calculate(String expression) {
        List<Integer> integers = StringParser.parseNumbers(expression, separator);
        int sum = 0;
        for (Integer number : integers) {
            sum += number;
        }
        return sum;
    }
}
