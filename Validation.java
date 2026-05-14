public class Validation {

    public static boolean isEmpty(String value) {

        return value == null || value.trim().isEmpty();
    }

    public static boolean isValidPriority(String priority) {

        return priority.equalsIgnoreCase("High")
                || priority.equalsIgnoreCase("Medium")
                || priority.equalsIgnoreCase("Low");
    }
}
