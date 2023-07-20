package pl.caloriapp.user;

public interface UserService {
    UserApp findByUserName(String username);
    void saveUser(UserApp user);
}
