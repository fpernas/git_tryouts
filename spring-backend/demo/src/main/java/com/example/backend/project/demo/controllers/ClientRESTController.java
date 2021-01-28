package com.example.backend.project.demo.controllers;

import java.util.List;

import com.example.backend.project.demo.models.entity.Client;
import com.example.backend.project.demo.models.services.IClientsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ClientRESTController {
    
    @Autowired IClientsService clientsService;

    @GetMapping("/clients")
    public List<Client> getAllClients() {
        return this.clientsService.findAll();
    }

}
