package com.example.backend.project.demo.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "CLIENT")
public class Client implements Serializable {
    
    private static final long serialVersionUID = 3191755126595544654L;

    @Id
    @GeneratedValue(generator = "ClientGeneratorSeq", strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "NAME")
    private String nombre;

    @Column(name = "LAST_NAME")
    private String apellido;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "CREATED")
    @Temporal(TemporalType.DATE)
    private Date createdAt;
}
