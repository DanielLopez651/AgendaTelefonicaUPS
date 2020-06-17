/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.controlador;

import java.util.Collection;
import ups.edu.ec.dao.TelefonoDAO;
import ups.edu.ec.dao.UsuarioDAO;
import ups.edu.ec.idao.ITelefonoDAO;
import ups.edu.ec.idao.IUsuarioDAO;
import ups.edu.ec.modelo.Telefono;
import ups.edu.ec.modelo.Usuario;

/**
 *
 * @author user
 */
public class ControladorUsuario {

    private Usuario usuario;
    private Telefono telefono;

    //Objetos DAO
    private IUsuarioDAO usuarioDAO;
    private ITelefonoDAO telefonoDAO;

    //Constructor sin parametros
    public ControladorUsuario() {

    }

    //Constructor con parametros
    public ControladorUsuario(UsuarioDAO usuarioDAO, TelefonoDAO telefonoDAO) {

        this.usuarioDAO = usuarioDAO;
        this.telefonoDAO = telefonoDAO;
    }

    public void registrar(String cedula,String nombre,String apellido,String correo, String contraseña) {
        usuario= new Usuario(cedula, nombre, apellido, correo, contraseña);
       
        usuarioDAO.create(usuario);
    }

    public void verUsuario(String cedula) {

    }

    public void actualizar(String cedula) {

    }

    //Genera un Usuario con la clave ingresada atraves de la vista y lo elimina atraves del DAO
    public void eliminar(String cedula) {

    }

    //Muestra en pantalla todos los usuarios existentes en el DAO atraves de la vista
    public void verUsuarios() {
    }

    public void agregarTelefono(int codigo) {
        telefono = telefonoDAO.read(codigo);
        usuario.agregarTelefono(telefono);
        usuarioDAO.update(usuario);
    }

    public void eliminarTelefono(String cedula) {

    }

    public void editarTelefono(String cedula) {

    }

    public void buscarTelefono(String cedula) {

    }

    public void listarTelefonos(String cedula) {

    }
}
