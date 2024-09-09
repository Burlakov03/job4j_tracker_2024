package ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User result = null;
        for (User user : users) {
            if (login.equals(user.getUsername())) {
                result = user;
                break;
            }
        }
        if (result == null) {
            throw new UserNotFoundException("NETY");
        }
        return result;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if ((user.getUsername().length() <= 3) || (!user.isValid())) {
            throw new UserInvalidException("malenkoe leng");
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Pe", true)
        };
        try {
            User user = findUser(users, "Pe");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException ex) {
            System.out.println("Пользователь не валидный");
        } catch (UserNotFoundException ex) {
            System.out.println("Пользователя нету");
        }
    }
}
