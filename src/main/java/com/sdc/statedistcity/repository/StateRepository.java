package com.sdc.statedistcity.repository;

import org.springframework.stereotype.Repository;

import com.sdc.statedistcity.dto.State;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface StateRepository extends JpaRepository<State, Long> {

}
