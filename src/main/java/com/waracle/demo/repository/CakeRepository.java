package com.waracle.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.waracle.demo.entity.Cake;

/**
 * Created by Nilesh
 */
@Repository
public interface CakeRepository extends JpaRepository<Cake, Integer>{
}
