package edu.escuelaing.arsw.projecDesign.service;

import edu.escuelaing.arsw.projecDesign.entities.Usuario;

public interface UsuarioService {
    public Boolean guardarUsuario(Usuario usuario);
    public Usuario buscarPorCorreo(String correo);
}
