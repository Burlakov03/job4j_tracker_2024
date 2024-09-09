package ex;

import java.util.Objects;

public class User {
    private final String username;
    private final boolean valid;

    public User(String username, boolean valid) {
        this.username = username;
        this.valid = valid;
    }

    public String getUsername() {
        return username;
    }

    public boolean isValid() {
        return valid;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        User user = (User) object;
        return valid == user.valid && Objects.equals(username, user.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, valid);
    }

    @Override
    public String toString() {
        return "User{"
                + "username='" + username + '\''
                + ", valid=" + valid
                + '}';
    }
}
