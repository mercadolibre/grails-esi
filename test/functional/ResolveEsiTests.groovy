import grails.util.Environment

class ResolveEsiTests extends functionaltestplugin.FunctionalTestCase {
  void testEsiInDev() {
    get('/esi')
    assertContentContains "hello world" 
  } 
  void testEsiInProd() {
    System.setProperty(Environment.KEY, Environment.PRODUCTION.toString())
    get('/esi')
    assertContentContains 'hello <esi:include src="http://localhost:8080/esi/esi/world" />'
  } 
}
