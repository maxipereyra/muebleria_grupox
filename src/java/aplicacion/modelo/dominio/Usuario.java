package aplicacion.modelo.dominio;

/**
 * representa un usuario
 * @author maximo
 */
public class Usuario {
    private String nombre;
    private String apellido;
    private String dni;
    private String usuario;
    private String contrasenia;
    private String email;
    private String direccion;
    private String telefono;
    private String estado;
    private Rol rol;
    
    /**
     * Constructor de la clase
     */
    public Usuario() {
    }

    /**
     * Constructor parametrizado
     * @param nombre
     * @param apellido
     * @param dni
     * @param usuario
     * @param contrasenia
     * @param email
     * @param direccion
     * @param telefono
     * @param estado 
     * @param rol 
     */


    
    public Usuario(String nombre, String apellido, String dni, String usuario, String contrasenia, String email, String direccion, String telefono, String estado, Rol rol) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.email = email;
        this.direccion = direccion;
        this.telefono = telefono;
        this.estado = estado;
        this.rol = rol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }


   
    
}
