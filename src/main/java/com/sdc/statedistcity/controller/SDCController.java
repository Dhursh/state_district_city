package com.sdc.statedistcity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sdc.statedistcity.dto.State;
import com.sdc.statedistcity.exception.ResourceNotFoundException;
import com.sdc.statedistcity.repository.StateRepository;

@RestController
@RequestMapping("/api")
public class SDCController {

	@Autowired
    StateRepository stateRepository;
	
	// Get All States
	@GetMapping("/states")
	public List<State> getAllNotes() {
	    return stateRepository.findAll();
	}
	
	// Get a Single State
	@GetMapping("/state/{id}")
	public State getNoteById(@PathVariable(value = "id") Long stateId) {
	    return stateRepository.findById(stateId)
	            .orElseThrow(() -> new ResourceNotFoundException("State", "id", stateId));
	}
}
