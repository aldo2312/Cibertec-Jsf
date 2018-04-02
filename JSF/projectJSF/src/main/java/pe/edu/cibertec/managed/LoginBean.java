/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.managed;

import java.util.ResourceBundle;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

@ManagedBean(name="login")
@SessionScoped
public class LoginBean {
    
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String autenticar(){
        
         //invocar registro a servicio de negocio
        boolean resultado=false;
        
        ResourceBundle rb=
                ResourceBundle.getBundle("pe.edu.cibertec.recursos.mensajes",
                 FacesContext.getCurrentInstance().getViewRoot().getLocale());
        
        if(username.equals("admin") && password.equals("5927"))
        {
            resultado=true;
        }
        
        //si servicio responde error por credenciales incorrectas
        if(!resultado){
         FacesMessage fm=new FacesMessage(FacesMessage.SEVERITY_ERROR,
                   rb.getString("validacion_login_incorrecto"),
                   rb.getString("validacion_login_incorrecto_detail"));
         FacesContext.getCurrentInstance().addMessage(null, fm);
            
            return null;
            
        }else{
            //si servicio responde ok
            password=null;
            return "principal";
        }        
    }
    
    public String logout() throws Exception {
            HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
            session.invalidate();
      return "login";
    }
}
