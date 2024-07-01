package com.nonglam.ILoveTruyen.controller;

import com.nonglam.ILoveTruyen.dto.DashboardDTO;
import com.nonglam.ILoveTruyen.service.AdminService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/admin")
public class AdminController {
    private final AdminService adminService;

    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @GetMapping
    public ResponseEntity<DashboardDTO> getDashboard() {
        return new ResponseEntity<>(adminService.getDashboard(), HttpStatus.OK);
    }
}
