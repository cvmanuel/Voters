package com.example.votersuk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.votersuk.model.VotersList;
import com.example.votersuk.repository.VotersRepository;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/api")
public class VotersController {
	
	
	@Autowired
	VotersRepository votersRepository;
	
	
	//Create new Voter in DB
	@PostMapping("/votes")
	
	public VotersList createVoters(@RequestBody VotersList voters) {
		return votersRepository.save(voters);
	}

}
