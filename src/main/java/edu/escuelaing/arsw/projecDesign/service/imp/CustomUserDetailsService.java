/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arsw.projecDesign.service.imp;
import edu.escuelaing.arsw.projecDesign.entities.Usuario;
import edu.escuelaing.arsw.projecDesign.repositories.UsuarioRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
/**
 *
 * @author Andres Davila
 */
@Service
public class CustomUserDetailsService implements UserDetailsService{
    
    @Autowired
    private UsuarioRepository userRepository;

    
    @Override
    @Transactional(readOnly=true)
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Usuario usuario=userRepository.findByCorreo(email);
        List<GrantedAuthority> authorities = usuario.getRoles()
                .stream()
                .map(role ->new SimpleGrantedAuthority(role.getRole()))
                .collect(Collectors.toList());
        return new User(usuario.getNombre(),usuario.getContrasena(),usuario.isEnabled(),true,true,true,authorities);

    }
    
}
