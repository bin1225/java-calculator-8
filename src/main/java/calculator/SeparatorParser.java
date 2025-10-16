package calculator;


public class SeparatorParser {

    /**
     * @param input     사용자로부터 입력받은 전체 문자열.
     *                  커스텀 구분자는 "//"와 첫 번째 개행 문자('\n') 사이에 위치한다.
     * @param separator 커스텀 구분자를 등록할 {@link Separator} 객체
     * @return          커스텀 구분자 선언부를 제외한 숫자 표현식 문자열
     */
    public static String parseSeparators(String input, Separator separator) {
        if(input.startsWith("//")) {
            int newStartIndex = input.indexOf("\\n")+1;
            System.out.println(newStartIndex);
            String customDelimiters = input.substring(2, newStartIndex);
            // 각 문자를 구분자로 등록
            for (char c : customDelimiters.toCharArray()) {
                separator.addSeparator(String.valueOf(c));
            }
            return input.substring(newStartIndex + 1);
        }
        return input;
    }
}
