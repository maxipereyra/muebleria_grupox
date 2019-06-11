/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.interfaces.dao;

import aplicacion.modelo.dominio.Usuario;
import java.util.List;

/**
 *
 * @author Grupo X
 */
public interface IUsuarioDAO {

    public void agregarUsuario(Usuario nuevo);
    public void borrarUsuario(Usuario borrado);
    public boolean validarUsuario(Usuario nuevo);
    public List<Usuario> obtenerListaUsuarios();
}