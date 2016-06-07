package sp_rc91_grails318

import com.stormpath.sdk.account.Account
import grails.transaction.Transactional
import org.springframework.security.access.prepost.PreAuthorize

@Transactional
class HelloService {

    /**
     * Only users who have a Custom Data entry in their Stormpath Account or Group containing something like
     * <code>"springSecurityPermissions":["say:*"]</code> or <code>"springSecurityPermissions":["say:hello"]</code>
     * will be allowed to execute this method.
     */
    @PreAuthorize("hasRole(T(Roles).ROLE_ADMIN) and hasPermission('say', 'hello')")
    public String sayHello(Account account) {
        return "Hello, " + account.getGivenName() +
                ". You have the required persmissions to access this restricted resource.";
    }
}
