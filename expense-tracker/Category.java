import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Category {

    public static final String FOOD = "Food";
    public static final String TRAVEL = "Travel";
    public static final String SHOPPING = "Shopping";
    public static final String MEDICAL = "Medical";
    public static final String ENTERTAINMENT = "Entertainment";
    public static final String OTHER = "Other";

    public static final List<String> VALID_CATEGORIES = Collections.unmodifiableList(
            Arrays.asList(FOOD, TRAVEL, SHOPPING, MEDICAL, ENTERTAINMENT, OTHER));

    public static boolean isValid(String category) {
        return category != null && VALID_CATEGORIES.contains(category);
    }
}
