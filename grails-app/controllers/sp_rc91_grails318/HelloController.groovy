package sp_rc91_grails318

import com.stormpath.sdk.servlet.account.AccountResolver

class HelloController {

    HelloService helloService

    def index() {
        render "You are at home"
    }

    def restricted() {
        String msg = helloService.sayHello(
                AccountResolver.INSTANCE.getAccount(request)
        );
        render "restricted $msg";
    }

    def restricted2() {
        String msg = helloService.sayHello(
                AccountResolver.INSTANCE.getAccount(request)
        );
        render "restricted2 $msg";
    }
}
