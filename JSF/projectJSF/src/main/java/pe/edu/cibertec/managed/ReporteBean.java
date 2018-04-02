/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.managed;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.event.ActionEvent;
import pe.edu.cibertec.dao.DaoCliente;
import pe.edu.cibertec.dao.implement.PersistenciaBDDaoCliente;
import pe.edu.cibertec.model.Cliente;


/**
 *
 * @author portatil
 */
@ManagedBean(name="reporte")
public class ReporteBean {
    
    private String tipo;
    private String titulo;
    private String codigo;
    
 
 
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    //private Cliente cliente=new Cliente();
    public List<Cliente> cliente ;

    public List<Cliente> getCliente() {
        cliente = daoCliente.listarCliente();
        return cliente;
    }

    public void setCliente(List<Cliente> cliente) {
        cliente = daoCliente.listarCliente();
        this.cliente = cliente;
    }
    
    private final DaoCliente daoCliente = new PersistenciaBDDaoCliente();
    
    public void confirmarAccion(ActionEvent ae){
        tipo=(String)ae.getComponent().getAttributes().get("tipo");
        titulo=(String)ae.getComponent().getAttributes().get("titulo");
    }

    public String consultar(){
       
      List<Cliente> cliente = daoCliente.listarCliente();
       if(cliente == null){
            return "reporte";
       }else{
            return "reporte";
        }
        
    }
   
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

   

   
}
