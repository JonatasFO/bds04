package com.devsuperior.bds04.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.bds04.entities.City;

public interface CityRepository extends JpaRepository<City, Long> {

}
