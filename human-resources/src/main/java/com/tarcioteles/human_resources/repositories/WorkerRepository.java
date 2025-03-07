package com.tarcioteles.human_resources.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tarcioteles.human_resources.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
