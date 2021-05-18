package edu.escuelaing.arsw.projecDesign.service.imp;


import edu.escuelaing.arsw.projecDesign.entities.Role;
import edu.escuelaing.arsw.projecDesign.repositories.RoleRepository;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import edu.escuelaing.arsw.projecDesign.entities.Usuario;
import edu.escuelaing.arsw.projecDesign.repositories.UsuarioRepository;
import edu.escuelaing.arsw.projecDesign.security.ApplicationUserRole;

/**
 *
 * @author Andres Davila
 */
@Service
public class CustomUserDetails implements UserDetailsService {

    @Autowired
    private UsuarioRepository userRepository;
    

    public Usuario findUserByEmail(String email) {
        return userRepository.findByCorreo(email);
    }

    /*public void saveUser(Usuario user) {
        user.setContrasena(bCryptPasswordEncoder.encode(user.getContrasena()));
        user.setEnabled(true);
        Role userRole = roleRepository.findByRole("ADMIN");
        user.setRoles(new HashSet<>(Arrays.asList(userRole)));
        userRepository.save(user);
    }*/

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        Usuario user = userRepository.findByCorreo(email);
        if (user != null) {
            ///List<GrantedAuthority> authorities = getUserAuthority(user.getRoles());
            return buildUserForAuthentication(user);
        } else {
            throw new UsernameNotFoundException("username not found");
        }
    }

    /*private List<GrantedAuthority> getUserAuthority(Set<Role> userRoles) {
        Set<GrantedAuthority> roles = new HashSet<>();
        userRoles.forEach((role) -> {
            roles.add(new SimpleGrantedAuthority(role.getRole()));
        });

        List<GrantedAuthority> grantedAuthorities = new ArrayList<>(roles);
        return grantedAuthorities;
    }*/

    private UserDetails buildUserForAuthentication(Usuario user) {
        
        return new org.springframework.security.core.userdetails.User(user.getCorreo(), user.getContrasena(),user.isEnabled(),true,true,true,ApplicationUserRole.ADMIN.getGrantedAuthorities());
    }

}
