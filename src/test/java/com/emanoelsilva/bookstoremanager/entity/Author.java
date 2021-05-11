package com.emanoelsilva.bookstoremanager.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data //Esta entidade adiciona automaticamente os metodos Getters, Setters, Equals e Hashcode
@Builder //Cria uma classe com os padroes build
@NoArgsConstructor //Adiciona um construtor sem argumentos
@AllArgsConstructor //Adiciona um construtor com todos os argumentos
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false)
    private Integer age;
}
