package com.microservice.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservice.model.Citizen;
@Repository
public interface CitizenRepository extends JpaRepository<Citizen, Integer> {
	public List<Citizen>  findByVaccinationcenterid(int vactinationcenterid);

}
