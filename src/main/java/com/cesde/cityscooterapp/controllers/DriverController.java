package com.cesde.cityscooterapp.controllers;

import com.cesde.cityscooterapp.domain.Driver;
import com.cesde.cityscooterapp.services.DriverService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/driver")
public class DriverController {
    private final DriverService driverService;

    public DriverController(DriverService driverService){
        this.driverService = driverService;
    }
    @PostMapping("/create")
    Driver createDriver(Driver driver){
        return driverService.createDriver(driver);
    }

}
