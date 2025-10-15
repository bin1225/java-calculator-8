package calculator;

import java.util.ArrayList;
import java.util.List;

public class StringParser {

    private final Separator separator;

    public StringParser(Separator separator) {
        this.separator = separator;
    }

    public List<Integer> parseNumbers(String expression) {
        List<Integer> resultNumbers = new ArrayList<>();
        StringBuilder number = new StringBuilder();

        for (char c : expression.toCharArray()) {
            if (separator.isSeparator(String.valueOf(c))) {
                if(!number.isEmpty()) resultNumbers.add(Integer.parseInt(number.toString()));
                number.setLength(0);
            } else {
                number.append(c);
            }
        }
        //마지막 숫자가 존재하면 추가
        if(!number.isEmpty()) resultNumbers.add(Integer.parseInt(number.toString()));
        return resultNumbers;
    }

}
