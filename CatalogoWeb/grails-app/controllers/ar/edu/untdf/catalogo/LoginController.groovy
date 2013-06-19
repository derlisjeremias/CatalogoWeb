package ar.edu.untdf.catalogo

class LoginController {    
    static layout='main'
    def beforeInterceptor = [action:this.&checkUser,except:['index']]
    
    def checkUser() {
        if(!session.user) {    
            redirect(controller:'login',action:'index')
            return false
            }
    }
    def index() {
    
    }
}
