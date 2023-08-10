package com.javou.almoxarifado.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javou.almoxarifado.models.Entrada;

public interface EntradaRepository extends JpaRepository<Entrada, Integer> {

}