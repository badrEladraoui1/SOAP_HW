package com.example.SoapHomeWork.repositpries;

import com.example.SoapHomeWork.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;


public interface GameRepository extends JpaRepository<Game , Integer> {
}
