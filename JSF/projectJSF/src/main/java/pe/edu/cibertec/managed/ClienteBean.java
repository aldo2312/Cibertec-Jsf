/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.managed;


import java.util.List;
import java.util.Map;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.event.ValueChangeEvent;
import pe.edu.cibertec.dao.DaoCliente;
import pe.edu.cibertec.dao.implement.PersistenciaBDDaoCliente;
import pe.edu.cibertec.model.Cliente;


/**
 *
 * @author portatil
 */
@ManagedBean(name="clienteBean")
public class ClienteBean {
   
    private Cliente cliente=new Cliente();
   // private Cliente cliente ;
    private final DaoCliente daoCliente = new PersistenciaBDDaoCliente();
    private String mensaje;
    private int codigo;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }   
    
    public  Cliente getCliente() {
            return cliente;
    }

    public void setCliente( Cliente cliente) {
        this.cliente = cliente;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
     public void confirmarAccion(ActionEvent ae){
        
        codigo = (Integer)ae.getComponent().getAttributes().get("codigo");
        System.out.println(codigo);
      }
 
    public String registrar(){
        String resultado = daoCliente.insertarCliente(cliente);
        
       if(resultado == null){
            return "reporte";
       }
       else{
             return "error";        
       }
    }
    
    public String irModificarCliente(){
        cliente = daoCliente.obtenerCliente(codigo);
        return "editar";
    }
    
    public String modificarCliente(){
         
       String resultado = daoCliente.modificarCliente(cliente);
        if(resultado == null){
              return "reporte";
       }else{
             return "reporte";
       }
    }
  
    public String eliminarCliente(){
        String resultado = daoCliente.eliminarCliente(codigo);
        if(resultado == null){
           
            return "reporte";
        }else{
            return "reporte";
        }
    }   
    
    public void mensajeProfesion(ValueChangeEvent e){
        String valor=(String)e.getNewValue();
        if(valor.equals("001")){
            setMensaje("Tenemos los mejores cursos de Arquitectura ");
        }
        if(valor.equals("002")){
            setMensaje("Grandes Eventos esperan por ti");
        }

    }
      
    
   
    
}
