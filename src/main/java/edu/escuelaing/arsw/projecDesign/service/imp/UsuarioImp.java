package edu.escuelaing.arsw.projecDesign.service.imp;

import com.google.gson.Gson;
import edu.escuelaing.arsw.projecDesign.entities.Usuario;
import edu.escuelaing.arsw.projecDesign.repositories.UsuarioRepository;
import edu.escuelaing.arsw.projecDesign.service.UsuarioService;
import java.util.List;
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

    @Override
    public String getUsuarios(){
    List<Usuario> usuarios= null;
    Gson enviar=new Gson();
    String jsonString = null;
    usuarios=usuarioRepository.findAll();
    jsonString=enviar.toJson(usuarios);
    return jsonString;
}
}
