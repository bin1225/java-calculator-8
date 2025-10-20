package calculator;

import calculator.print.InputView;
import calculator.print.OutputView;
import camp.nextstep.edu.missionutils.Console;
import java.util.List;

public class CalculatorManager {

    private static final Separator targetSeparators = new Separator(List.of(":", ","));
    private static final Calculator calculator = new Calculator(targetSeparators);


    public static void run() {
        InputView.readExpression();
        String input = Console.readLine();

        String parsedInput = SeparatorParser.parseAndExtractExpression(input, targetSeparators);
        int result = calculator.calculate(parsedInput);

        OutputView.printResult(result);
    }
}