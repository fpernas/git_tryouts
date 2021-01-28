package com.example.backend.project.demo.models.dao;

import com.example.backend.project.demo.models.entity.Client;

import org.springframework.data.repository.CrudRepository;

public interface IClientDAO extends CrudRepository<Client, Long> {
    
}
