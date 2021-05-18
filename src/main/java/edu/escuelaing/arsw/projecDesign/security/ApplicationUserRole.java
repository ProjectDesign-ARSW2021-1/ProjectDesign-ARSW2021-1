package edu.escuelaing.arsw.projecDesign.security;

import com.google.common.collect.Sets;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Set;
import java.util.stream.Collectors;

import static edu.escuelaing.arsw.projecDesign.security.ApplicationUserPermission.*;

public enum ApplicationUserRole {
    CLIENT(Sets.newHashSet(CAR_READ,PRODUCT_READ)),
    ADMIN(Sets.newHashSet(CAR_READ, CAR_WRITE, PRODUCT_READ, PRODUCT_WRITE,INVENTORY_READ,INVENTORY_WRITE)),
    ADMINTRAINEE(Sets.newHashSet(CAR_READ, PRODUCT_READ,INVENTORY_READ));

    private final Set<ApplicationUserPermission> permissions;

    ApplicationUserRole(Set<ApplicationUserPermission> permissions) {
        this.permissions = permissions;
    }

    public Set<ApplicationUserPermission> getPermissions() {
        return permissions;
    }

    public Set<SimpleGrantedAuthority> getGrantedAuthorities() {
        Set<SimpleGrantedAuthority> permissions = getPermissions().stream()
                .map(permission -> new SimpleGrantedAuthority(permission.getPermission()))
                .collect(Collectors.toSet());
        permissions.add(new SimpleGrantedAuthority("ROLE_" + this.name()));
        return permissions;
    }
}


