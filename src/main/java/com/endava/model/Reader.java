//package com.endava.model;
//
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import java.util.Arrays;
//import java.util.Collection;
//
//@Entity
//public class Reader implements UserDetails {
//
//    private static final long serialVersionUID = 1L;
//
//    // Reader fields
//    @Id
//    private String username;
//    private String fullname;
//    private String password;
//
//
//    // Getters and setters
//    @Override
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public String getFullname() {
//        return fullname;
//    }
//
//    public void setFullname(String fullname) {
//        this.fullname = fullname;
//    }
//
//    @Override
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    // User details methods
//    /**
//     * Returns the authorities granted to the user. Cannot return <code>null</code>.
//     *
//     * @return the authorities, sorted by natural key (never <code>null</code>)
//     */
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() { // Grant READER privilege
//        return Arrays.asList(new SimpleGrantedAuthority("READER"));
//    }
//
//    /**
//     * Indicates whether the user's account has expired. An expired account cannot be
//     * authenticated.
//     *
//     * @return <code>true</code> if the user's account is valid (ie non-expired),
//     * <code>false</code> if no longer valid (ie expired)
//     */
//    @Override
//    public boolean isAccountNonExpired() {
//        return true; // Will never expire
//    }
//
//    /**
//     * Indicates whether the user is locked or unlocked. A locked user cannot be
//     * authenticated.
//     *
//     * @return <code>true</code> if the user is not locked, <code>false</code> otherwise
//     */
//    @Override
//    public boolean isAccountNonLocked() {
//        return true; // Will never lock
//    }
//
//    /**
//     * Indicates whether the user's credentials (password) has expired. Expired
//     * credentials prevent authentication.
//     *
//     * @return <code>true</code> if the user's credentials are valid (ie non-expired),
//     * <code>false</code> if no longer valid (ie expired)
//     */
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return true; // Will never expire password
//    }
//
//    /**
//     * Indicates whether the user is enabled or disabled. A disabled user cannot be
//     * authenticated.
//     *
//     * @return <code>true</code> if the user is enabled, <code>false</code> otherwise
//     */
//    @Override
//    public boolean isEnabled() {
//        return true; // Will never be disabled
//    }
//
//
//}
