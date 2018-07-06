package com.example.votersuk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.votersuk.model.VotersList;

@Repository
public interface VotersRepository extends JpaRepository<VotersList,Integer> {

}
