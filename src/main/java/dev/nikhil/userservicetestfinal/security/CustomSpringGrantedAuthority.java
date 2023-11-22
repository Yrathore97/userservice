package dev.nikhil.userservicetestfinal.security;

import dev.nikhil.userservicetestfinal.models.Role;
import org.springframework.security.core.GrantedAuthority;

public class CustomSpringGrantedAuthority implements GrantedAuthority {
    private Role role;

    public CustomSpringGrantedAuthority(Role role) {
        this.role = role;
    }

    @Override
    public String getAuthority() {
        return role.getRole();
    }
}
