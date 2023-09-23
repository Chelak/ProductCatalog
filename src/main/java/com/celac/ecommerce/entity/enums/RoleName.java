package com.celac.ecommerce.entity.enums;

/**
 * @author scelac
 */
public enum RoleName {
    GUEST("GUEST"),
    ADMIN("ADMIN"),
    SALE_MANAGER("SALE_MANAGER"),
    CUSTOMER("CUSTOMER");
    private String role;

    RoleName(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return this.role;
    }
}
