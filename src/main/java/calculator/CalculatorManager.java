package calculator;

import camp.nextstep.edu.missionutils.Console;
import java.util.List;

public class CalculatorManager {

    private static final Separator targetSeparators = new Separator(List.of(":", ","));
    private static final Calculator calculator = new Calculator(targetSeparators);


    public static void run() {
        System.out.println("덧셈할 문자열을 입력해주세요.");
        String input = Console.readLine();

        String parsedInput = SeparatorParser.parseAndExtractExpression(input, targetSeparators);
        int result = calculator.calculate(parsedInput);

        System.out.printf("결과 : %d\n", result);
    }
}