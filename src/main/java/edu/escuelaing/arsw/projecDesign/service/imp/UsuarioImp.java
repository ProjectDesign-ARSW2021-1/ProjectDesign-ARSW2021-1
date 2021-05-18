package edu.escuelaing.arsw.projecDesign.service.imp;

import edu.escuelaing.arsw.projecDesign.entities.Role;
import edu.escuelaing.arsw.projecDesign.entities.Usuario;
import edu.escuelaing.arsw.projecDesign.repositories.RoleRepository;
import edu.escuelaing.arsw.projecDesign.repositories.UsuarioRepository;
import edu.escuelaing.arsw.projecDesign.security.PasswordConfig;
import edu.escuelaing.arsw.projecDesign.service.UsuarioService;

import java.util.Arrays;
import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class UsuarioImp implements UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;
    @Autowired
    PasswordConfig passwordConfig;
    @Autowired
    RoleRepository roleRepository;

    @Override
    public Boolean guardarUsuario(Usuario usuario) {
        try{
            Long cantidad=usuarioRepository.count();
            System.out.println(cantidad);
            usuario.setEnabled(true);
            usuario.setContrasena(passwordConfig.passwordEncoder().encode(usuario.getContrasena()));
            Role userRole = roleRepository.findByRole("ADMIN");
            usuario.setRoles(new HashSet<>(Arrays.asList(userRole)));
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
