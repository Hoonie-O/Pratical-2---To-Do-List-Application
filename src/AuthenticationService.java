import java.util.ArrayList;

public class AuthenticationService implements IAuthenticationService {
    private ArrayList<User> userlist;

    // TODO Now: Add a constructor to initialize the users list with the default user
        public AuthenticationService() {
            User user = new User("Seiji", "123123");
                    userlist = new ArrayList<User>();
                            userlist.add(user);
        }

    // TODO Now: Implement the signUp method to add a new user to the list if the username is not taken and return the user; returns null otherwise
        public User signUp(String username, String password) {
            for (User u : userlist) {
                if (u.getUsername().equals(username)) {
                    return null;
                }
            }
            User newUser = new User(username, password);
            userlist.add(newUser);
            return newUser;
        }

    // TODO Now: Implement the logIn method d password match, to return the user if the username anand null otherwise
            public User logIn(String username, String password) {
                for (User u : userlist) {
                    if (u.getUsername().equals(username) && u.getPassword().equals(password)) {
                        return u;
                    }
                }
            return null;
        }
    }


