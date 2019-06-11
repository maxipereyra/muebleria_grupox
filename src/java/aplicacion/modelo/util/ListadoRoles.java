
package aplicacion.modelo.util;

import aplicacion.modelo.dominio.Rol;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Representa una lista de Roles 
 * @author grupoX
 */
public class ListadoRoles implements Serializable {    
    private List<Rol> listaroles;

    /**
     * Constructor por defecto
     */
    public ListadoRoles() {
        listaroles = new ArrayList<>();
        precargaroles();        
    }
    
    /**
     *  Precarga roles para gestionar la aplicacion
     */
    public void precargaroles() {
        listaroles.add(new Rol(0, "Administrador", "Usuario administrador con todos los privilegios", "Activo"));
        listaroles.add(new Rol(1, "Usuario", "Usuario normal tiene acceso al compra de productos", "Activo"));
        listaroles.add(new Rol(2, "Gerente", "Usuario tiene acceso completo a gran parte del sistema", "Activo"));
        listaroles.add(new Rol(3, "Administrativo", "Usuario tiene acceso restringido a parte del sistema", "Activo"));
    }

    /// Getters and Setters
    
    public List<Rol> getListaroles() {
        return listaroles;
    }
    
    public void setListaroles(List<Rol> listaroles) {
        this.listaroles = listaroles;
    }
    
}
