package ex;

public class PasswordValidator {
    private static final String[] FORBIDDEN = {"qwerty", "12345", "password", "admin", "user"};

    public static String validate(String password) {
        if (password == null) {
            throw new IllegalArgumentException("Password can't be null");
        }
        if (password.length() < 8 || password.length() > 32) {
            throw new IllegalArgumentException("Password should be length [8, 32]");
        }
        if (toWordCase(password, password.toUpperCase())) {
            throw new IllegalArgumentException("Password should contain at least one uppercase letter");
        }
        if (toWordCase(password, password.toLowerCase())) {
            throw new IllegalArgumentException("Password should contain at least one lowercase letter");
        }
        if (isNumber(password)) {
            throw new IllegalArgumentException("Password should contain at least one figure");
        }
        if (isSpecial(password)) {
            throw new IllegalArgumentException("Password should contain at least one special symbol");
        }
        if (isStopWords(password.toLowerCase())) {
            throw new IllegalArgumentException("Password shouldn't contain substrings: qwerty, 12345, password, admin, user");
        }
        return password;
    }

    public static boolean toWordCase(String word, String search) {
        for (int i = 0; i < word.length(); i++) {
            if (Character.isAlphabetic(word.charAt(i)) && word.charAt(i) == search.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isNumber(String word) {
        for (char ch : word.toCharArray()) {
            if (Character.isDigit(ch)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSpecial(String word) {
        for (char ch : word.toCharArray()) {
            if (!Character.isLetterOrDigit(ch)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isStopWords(String word) {
        String[] stopWords = new String[] {"qwerty", "12345", "password", "admin", "user"};
        for (String sw : stopWords) {
            if (word.contains(sw)) {
                return true;
            }
        }
        return false;
    }
}
