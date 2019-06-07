package aplicacion.modelo.dominio;

/**
 * representa un usuario
 * @author maximo
 */
public class Usuario {
    private Integer id;
    private Integer dni;
    private String apellido;
    private String nombre;
    private String direccion;
    private String email;
    private Integer telefono;
    private String password;
    private String estado;
    
    /**
     * Constructor de la clase
     */
    public Usuario() {
    }

    /**
     * Constructor parametrizado
     * @param id
     * @param dni
     * @param apellido
     * @param nombre
     * @param direccion
     * @param email
     * @param telefono
     * @param password
     * @param estado 
     */
    public Usuario(Integer id, Integer dni, String apellido, String nombre, String direccion, String email, Integer telefono, String password, String estado) {
        this.id = id;
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.direccion = direccion;
        this.email = email;
        this.telefono = telefono;
        this.password = password;
        this.estado = estado;
    }

    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
   
    
}
