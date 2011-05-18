package esi

import grails.util.Environment

class EsiTagLib {
    static namespace = "esi"
    
    def include = { attrs, body ->
        if(Environment.current == Environment.PRODUCTION) {
            out << "<esi:include src=\"${createLink(controller:attrs.controller, action:attrs.action, absolute:true)}\" />"
        } else {
            out << g.include(controller:attrs.controller, action:attrs.action)
        }
    }
}
