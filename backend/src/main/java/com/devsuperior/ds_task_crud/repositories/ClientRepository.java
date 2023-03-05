package com.devsuperior.ds_task_crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.ds_task_crud.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}
