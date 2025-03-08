package com.tarcioteles.human_resources.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.tarcioteles.human_resources.entities.Worker;
import com.tarcioteles.human_resources.repositories.WorkerRepository;

@Component
public class Test implements CommandLineRunner {

    @Autowired
    private WorkerRepository workerRepository;

    @Override
    public void run(String... args) throws Exception {
        List<Worker> workers = new ArrayList<>();

        workers.add(new Worker(1L, "João Silva", 250.0));
        workers.add(new Worker(2L, "Maria Oliveira", 300.0));
        workers.add(new Worker(3L, "Pedro Santos", 150.0));
        workers.add(new Worker(4L, "Ana Costa", 400.0));
        workers.add(new Worker(5L, "Luiz Souza", 275.0));
        workers.add(new Worker(6L, "Camila Pereira", 320.0));
        workers.add(new Worker(7L, "Carlos Rodrigues", 190.0));
        workers.add(new Worker(8L, "Fernanda Lima", 360.0));
        workers.add(new Worker(9L, "Lucas Alves", 215.0));
        workers.add(new Worker(10L, "Juliana Ferreira", 290.0));
        workers.add(new Worker(11L, "Rafael Mendes", 310.0));
        workers.add(new Worker(12L, "Patrícia Souza", 280.0));
        workers.add(new Worker(13L, "Bruno Silva", 240.0));
        workers.add(new Worker(14L, "Thaís Gomes", 330.0));
        workers.add(new Worker(15L, "Cláudio Ribeiro", 220.0));

        workerRepository.saveAll(workers);
    }
}
