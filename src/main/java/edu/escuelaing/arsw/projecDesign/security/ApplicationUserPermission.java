package edu.escuelaing.arsw.projecDesign.security;

public enum ApplicationUserPermission {
    CAR_READ("car:read"),
    CAR_WRITE("car:write"),
    PRODUCT_READ("product:read"),
    PRODUCT_WRITE("product:write"),
    INVENTORY_READ("inventory:read"),
    INVENTORY_WRITE("inventory:write");

    private final String permission;

    ApplicationUserPermission(String permission) {
        this.permission = permission;
    }

    public String getPermission() {
        return permission;
    }
}
