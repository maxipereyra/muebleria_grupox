/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans.forms;

import aplicacion.controlador.beans.UsuarioBean;
import aplicacion.modelo.dominio.Usuario;
import aplicacion.modelo.util.ListadoRoles;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Grupo X
 */
@ManagedBean
@ViewScoped
public class UsuariosFormBean implements Serializable {

    private String nombre;
    private String password;
    @ManagedProperty(value = "#{usuarioBean}")
    private UsuarioBean usuarioBean;
    private Usuario usuario;
    private List<Usuario> listaUsuarios;

    /**
     * Creates a new instance of PeliculasFormBean
     */
    public UsuariosFormBean() {
        listaUsuarios = new ArrayList<>();

    }

    @PostConstruct
    public void init() {
        usuario = new Usuario();
        obtenerListaUsuarios();

    }

    public void agregarUsuario() {
        usuarioBean.agregarUsuario(usuario);
    }

    public void borrarUsuario(Usuario usuario) {
        usuarioBean.borrarUsuario(usuario);
    }

    public String validarlogin() {
        String retorno = null;
        usuario.setUsuario(nombre);
        usuario.setContrasenia(password);
        FacesContext context = FacesContext.getCurrentInstance();
        if (usuarioBean.validarUsuario(usuario) == true) {
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Bienvenida/o", ""));
            retorno = "tabla?faces-redirect=true";
        } else {
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "El nombre de usuario o contraseña son incorrectos.  Por favor inténtalo de nuevo.", "El usuario o contraseña son incorrectas"));
            retorno = "";
        }
        return retorno;

    }

    public void crearCuenta() {
        System.out.println(usuario.getNombre());
        usuario.setEstado("Activo");
        usuario.setRol(new ListadoRoles().getListaroles().get(1));
        System.out.println("estado2: " + usuario.getEstado());
        System.out.println("rol: " + usuario.getRol().getNombre());
        usuarioBean.agregarUsuario(usuario);
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Registracion Exitosa!!!", "Bienvenido"));
    }

    //Getters and Setters
    public void obtenerListaUsuarios() {
        setListaUsuarios(usuarioBean.obtenerListaUsuarios());
    }

    public UsuarioBean getUsuarioBean() {
        return usuarioBean;
    }

    public void setUsuarioBean(UsuarioBean usuarioBean) {
        this.usuarioBean = usuarioBean;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
