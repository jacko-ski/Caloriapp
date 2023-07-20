package pl.caloriapp.user;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;

public class CurrentUser extends User { // informacja o aktualnie zalogowanym uzytkowniku
    private final UserApp user;

    public CurrentUser(String username, String password,
                       Collection<? extends GrantedAuthority> authorities,
                       UserApp user) {
        super(username, password, authorities);
        this.user = user;
    }

    public UserApp getUser() {
        return user;
    }
}
