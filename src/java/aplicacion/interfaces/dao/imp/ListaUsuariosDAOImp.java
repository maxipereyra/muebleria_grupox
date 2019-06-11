/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.interfaces.dao.imp;

import aplicacion.interfaces.dao.IUsuarioDAO;
import aplicacion.modelo.dominio.Usuario;
import aplicacion.modelo.util.ListaUsuarios;
import java.io.Serializable;
import java.util.List;
import javax.faces.context.FacesContext;

/**
 *
 * @author Grupo X
 */
public class ListaUsuariosDAOImp implements Serializable, IUsuarioDAO {

    private ListaUsuarios listadoDeUsuarios;

    /**
     * Constructor sin Parametros
     */
    public ListaUsuariosDAOImp() {
        Object cuentas = FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("cuentas");
        if (cuentas == null) {
            listadoDeUsuarios = new ListaUsuarios();
        } else {
            listadoDeUsuarios = (ListaUsuarios) cuentas;
        }
    }

    /**
     * Constructor conParametros
       */
    public ListaUsuariosDAOImp(ListaUsuarios listadoDeUsuarios) {
        this.listadoDeUsuarios = listadoDeUsuarios;
    }

    /**
     * Agregar un nuevo usuario
     */
    @Override
    public void agregarUsuario(Usuario nuevo) {
        getListadoDeUsuarios().agregarUsuario(nuevo);
        FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("cuentas", getListadoDeUsuarios());
    }

    /**
     * Permite borrar un usuario
     */
    @Override
    public void borrarUsuario(Usuario borrado) {
        listadoDeUsuarios.borrarUsuario(borrado);
    }

    /**
     * Verifica si existe el usuario en la lista
     */
    @Override
    public boolean validarUsuario(Usuario nuevo) {
        return listadoDeUsuarios.validarUsuario(nuevo);
    }

    /**
     * Devuelve la lista de usuarios registrados
     */
    @Override
    public List<Usuario> obtenerListaUsuarios() {
        return listadoDeUsuarios.getListaUsuarios();
    }

    /* Getters and Setters
     */
    public ListaUsuarios getListadoDeUsuarios() {
        return listadoDeUsuarios;
    }

    public void setListadoDeUsuarios(ListaUsuarios listadoDeUsuarios) {
        this.listadoDeUsuarios = listadoDeUsuarios;
    }

    //Metodo toString
    @Override
    public String toString() {
        return "ListaUsuariosDAOImp{" + "listadoDeUsuarios=" + getListadoDeUsuarios() + '}';
    }

}
