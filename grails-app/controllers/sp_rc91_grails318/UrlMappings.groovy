package sp_rc91_grails318

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(controller: 'application', action:'index')
        "403"(controller: "errors", action: "forbidden")
        "404"(controller: "errors", action: "notFound")
        "500"(controller: "errors", action: "serverError")
    }
}
