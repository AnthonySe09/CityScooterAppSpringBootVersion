package com.cesde.cityscooterapp.domain;

import com.cesde.cityscooterapp.domain.enums.RolEnum;

public class Employee extends User {
    private RolEnum rol;


    public Employee(){
        super();
    }

    public Employee(int id, String name, String lastName, String phonr, String email, String password, boolean status, RolEnum rol) {
        super(id, name, lastName, phonr, email, password, status);
        this.rol = rol;
    }

    public RolEnum getRol() {
        return rol;
    }

    public void setRol(RolEnum rol) {
        this.rol = rol;
    }
 }
