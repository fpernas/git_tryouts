package com.example.backend.project.demo.models.services;

import java.util.List;

import com.example.backend.project.demo.models.entity.Client;

public interface IClientsService {
    
    List<Client> findAll();

}
