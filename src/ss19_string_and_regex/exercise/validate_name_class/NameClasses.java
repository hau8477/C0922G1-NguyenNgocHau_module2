package ss19_string_and_regex.exercise.validate_name_class;
import java.util.regex.Pattern;

public class NameClasses {
    private static final String NAME_CLASS_REGEX = "^[A|C|G]\\d{4}[G-I|K-M]$";

    public boolean validateNameClasses(String string) {
        return Pattern.matches(NAME_CLASS_REGEX, string);
    }
}
