package calculator;

import java.util.ArrayList;
import java.util.List;

public class StringParser {

    public static List<Integer> parseNumbers(String expression, Separator separator) {
        List<Integer> resultNumbers = new ArrayList<>();
        StringBuilder number = new StringBuilder();

        for (char c : expression.toCharArray()) {
            if (separator.isSeparator(String.valueOf(c))) {
                if (!number.isEmpty()) {
                    resultNumbers.add(Integer.parseInt(number.toString()));
                }
                number.setLength(0);
                continue;
            }

            if (!Character.isDigit(c)) {
                throw new IllegalArgumentException("잘못된 입력입니다: '" + c + "'");
            }
            number.append(c);
        }
        //마지막 숫자가 존재하면 추가
        if (!number.isEmpty()) {
            resultNumbers.add(Integer.parseInt(number.toString()));
        }
        return resultNumbers;
    }

}
