
package aplicacion.modelo.dominio;

import java.io.Serializable;

/**
 *  Representa el rol que puede asumir un Usuario
 * @author grupoX
 */
public class Rol implements Serializable {
    private int codigo;
    private String nombre;
    private String descripcion;
    private String estado;

    /**
     * Constructor por defecto
     */
    public Rol() {
    }

    /**
     *  Constructor parametrizado
     * @param codigo individualiza un rol
     * @param nombre especifica el nombre del rol
     * @param descripcion detalla caracteristicas de rol
     * @param estado 
     */
    public Rol(int codigo, String nombre, String descripcion, String estado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estado = estado;
    }


    /// Getters and Setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
