/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans;

import aplicacion.interfaces.dao.IUsuarioDAO;
import aplicacion.interfaces.dao.imp.ListaUsuariosDAOImp;
import aplicacion.modelo.dominio.Usuario;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Grupo X
 */
@ManagedBean
@ViewScoped
public class UsuarioBean implements Serializable {

    private Usuario usuario;
    private IUsuarioDAO usuarioDAO;

    public UsuarioBean() {
        usuarioDAO = new ListaUsuariosDAOImp();
    }

    public void agregarUsuario(Usuario nuevo) {
        getUsuarioDAO().agregarUsuario(nuevo);
    }

    public void borrarUsuario(Usuario borrado) {
        getUsuarioDAO().borrarUsuario(borrado);
    }

    public boolean validarUsuario(Usuario acesso) {
        return getUsuarioDAO().validarUsuario(acesso);
    }

    public List<Usuario> obtenerListaUsuarios() {
        return usuarioDAO.obtenerListaUsuarios();
    }

    /* Getters and Setters
     */

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public IUsuarioDAO getUsuarioDAO() {
        return usuarioDAO;
    }

    public void setUsuarioDAO(IUsuarioDAO usuarioDAO) {
        this.usuarioDAO = usuarioDAO;
    }
}
