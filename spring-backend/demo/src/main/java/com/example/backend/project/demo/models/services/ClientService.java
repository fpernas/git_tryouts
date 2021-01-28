package com.example.backend.project.demo.models.services;

import java.util.ArrayList;
import java.util.List;

import com.example.backend.project.demo.models.dao.IClientDAO;
import com.example.backend.project.demo.models.entity.Client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClientService implements IClientsService {

    @Autowired IClientDAO clientDAO;

    @Override
    @Transactional(readOnly = true)
    public List<Client> findAll() {
        List<Client> clients = new ArrayList<>();
        clientDAO.findAll().forEach(clients::add);
        return clients;
    }
    
}
