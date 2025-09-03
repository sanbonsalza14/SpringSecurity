package com.my.securityTest.dto;

import com.my.securityTest.entity.UserEntity;
import org.springframework.security.core.GrantedAuthority;

import org.springframework.security.core.authority.SimpleGrantedAuthority;


import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CustomUserDetails implements UserDetails {
    private UserEntity userEntity;


    public CustomUserDetails(UserEntity userEntity) {
        this.userEntity = userEntity;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority(userEntity.getRole().name()));


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of();

    }

    @Override
    public String getPassword() {

        return userEntity.getPassword();

        return "";

    }

    @Override
    public String getUsername() {

        return userEntity.getUsername();

        return "";

    }

    @Override
    public boolean isAccountNonExpired() {


        return UserDetails.super.isAccountNonExpired();

    }

    @Override
    public boolean isAccountNonLocked() {

        return true;

        return UserDetails.super.isAccountNonLocked();

    }

    @Override
    public boolean isCredentialsNonExpired() {

        return true;

        return UserDetails.super.isCredentialsNonExpired();

    }

    @Override
    public boolean isEnabled() {

        return true;
    }
}

        return UserDetails.super.isEnabled();
    }
}

