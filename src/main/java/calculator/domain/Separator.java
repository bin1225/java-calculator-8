package calculator.domain;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Separator {

    private final Set<String> separatorMap = new HashSet<>();

    public Separator(List<String> defaultSeparators) {
        defaultSeparators.forEach(this::addSeparator);
    }

    public void addSeparator(String separator) {
        separatorMap.add(separator);
    }

    public boolean isSeparator(String separator) {
        return separatorMap.contains(separator);
    }
}
