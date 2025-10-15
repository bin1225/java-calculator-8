package calculator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Separator {

    private final Map<String, Boolean> separatorMap = new HashMap<>();

    public Separator(List<String> defaultSeparators) {
        defaultSeparators.forEach(this::addSeparator);
    }

    public void addSeparator(String separator) {
        separatorMap.put(separator, true);
    }

    public boolean isSeparator(String separator) {
        return separatorMap.containsKey(separator);
    }
}
