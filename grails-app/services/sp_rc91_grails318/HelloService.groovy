package sp_rc91_grails318

import com.stormpath.sdk.account.Account
import grails.transaction.Transactional
import org.springframework.security.access.prepost.PreAuthorize

@Transactional
class HelloService {


    @PreAuthorize("hasRole(@roles.ROLE_ADMIN)")
    public String sayHello(Account account) {
        return "Hello, " + account.getGivenName() +
                ". You have the required permissions to access this restricted resource.";
    }
}
