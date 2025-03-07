package com.tarcioteles.human_resources.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tarcioteles.human_resources.entities.Worker;
import com.tarcioteles.human_resources.repositories.WorkerRepository;

@RestController
@RequestMapping(value = "/workers")
public class WorkController {
	
	@Autowired
	private WorkerRepository workerRepository;
	
	@GetMapping
	public ResponseEntity<List<Worker>> findall(){
		List<Worker> list = workerRepository.findAll();
		return ResponseEntity.ok(list);
	}
}
