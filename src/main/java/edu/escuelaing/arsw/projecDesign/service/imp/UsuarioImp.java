package edu.escuelaing.arsw.projecDesign.service.imp;

import edu.escuelaing.arsw.projecDesign.entities.Usuario;
import edu.escuelaing.arsw.projecDesign.repositories.UsuarioRepository;
import edu.escuelaing.arsw.projecDesign.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UsuarioImp implements UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public Boolean guardarUsuario(Usuario usuario) {
        try{
            Long cantidad=usuarioRepository.count();
            System.out.println(cantidad);
            usuarioRepository.save(usuario);
            return true;
        }catch (Exception e){
            System.out.println(e.getStackTrace()[0]);
            return false;
        }
    }

    @Override
    public Usuario buscarPorCorreo(String correo) {
        Usuario usuario=null;
        try{
            usuario=usuarioRepository.findByCorreo(correo);
        }catch (Exception e){
            System.out.println("No se encontro el usuario");
        }
        return usuario;
    }
}
