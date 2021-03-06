/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author E-JAVMAS-MJ
 */
@FacesConverter(value="numeroMovil")
public class NumeroMovilConverter implements Converter{

    @Override
    public Object getAsObject(  FacesContext context, 
                                UIComponent component, 
                                String value) {
        
        
        if(value==null|| value.equals("")) return null;
        if(value.charAt(3)=='-') return value;

        return value.substring(0,3)+"-"+value.substring(3);
        
    }

    @Override
    public String getAsString(  FacesContext context, 
                                UIComponent component, 
                                Object value) {
        return value.toString();
    }
    
}
