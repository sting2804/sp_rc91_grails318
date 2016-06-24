package sp_rc91_grails318;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class Roles {
    public final String ROLE_ADMIN;
    public final String ROLE_NEW_USER;

    @Autowired
    public Roles(Environment env) {
        this.ROLE_ADMIN = env.getProperty("stormpath.authorized.group.admin");
        this.ROLE_NEW_USER = env.getProperty("stormpath.authorized.group.roleNewUser");
    }

}
