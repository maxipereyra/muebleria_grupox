/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.util;

import aplicacion.modelo.dominio.Usuario;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Grupo x
 */
public class ListaUsuarios implements Serializable {

    private List<Usuario> listaUsuarios;

    /**
     * Constructor sin parametros
     */
    public ListaUsuarios() {
        listaUsuarios = new ArrayList<>();
        ListadoRoles listadoRoles = new ListadoRoles();
        listaUsuarios.add(new Usuario("prueba", "Test", "28546853", "Tester", "alumno", "test@test.com", "Del mundo", "125896453", "Activo", listadoRoles.getListaroles().get(0)));

    }

    /**
     * Constructor parametrizado
     */
    public ListaUsuarios(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    /**
     * Metodo que permite agregar un nuevo usuario
     */
    public void agregarUsuario(Usuario nuevo) {
        listaUsuarios.add(nuevo);
    }

    /**
     * Metodo que permite borrar el usuario enviado por parametro
     */
    public void borrarUsuario(Usuario borrado) {
        for (int i = 0; i < listaUsuarios.size(); i++) {
            if (listaUsuarios.get(i).getUsuario().equals(borrado.getUsuario())) {
                listaUsuarios.get(i).setEstado("Borrado");
            }
        }
    }

    /**
     * Permite verificar si un Usuario se encuentra registrado
     */
    public boolean validarUsuario(Usuario nuevo) {
        boolean autorizado = false;
        for (int i = 0; i < listaUsuarios.size(); i++) {
            if (listaUsuarios.get(i).getUsuario().equals(nuevo.getUsuario()) && listaUsuarios.get(i).getContrasenia().equals(nuevo.getContrasenia())) {
                autorizado = true;
            }
        }
        return autorizado;
    }

    /**
     * Devuelve una cadena personalizada con los valores de los atributos de
     * cada usuario
     */
    @Override
    public String toString() {
        return "ListaUsuarios{" + "lista de Usuarios=" + getListaUsuarios() + '}';
    }

    /**
     * @return the listaUsuarios
     */
    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    /**
     * @param listaUsuarios the listaUsuarios to set
     */
    public void setListaUsuarios(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

}
