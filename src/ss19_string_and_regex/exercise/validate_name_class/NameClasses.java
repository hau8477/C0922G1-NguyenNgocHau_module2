package ss19_string_and_regex.exercise.validate_name_class;
import java.util.regex.Pattern;

public class NameClasses {
    private static final String NAME_CLASS_REGEX = "^[A|C|G]\\d{4}[G-M]$";

    public boolean validateNameClasses(String regex) {
        return Pattern.matches(NAME_CLASS_REGEX, regex);
    }
}
