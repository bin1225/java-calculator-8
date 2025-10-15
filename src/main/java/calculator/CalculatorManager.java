package calculator;

import camp.nextstep.edu.missionutils.Console;
import java.util.List;

public class CalculatorManager {

    private static final Separator defaultSeparators = new Separator(List.of(":", ","));
    private static final Calculator calculator = new Calculator(defaultSeparators);


    public static void run() {
        System.out.println("덧셈할 문자열을 입력해주세요.");

        int result = calculator.calculate(Console.readLine());

        System.out.printf("결과 : %d\n", result);
    }
}