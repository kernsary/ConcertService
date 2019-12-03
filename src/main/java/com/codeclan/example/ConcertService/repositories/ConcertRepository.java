package com.codeclan.example.ConcertService.repositories;

import com.codeclan.example.ConcertService.models.Concert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConcertRepository extends JpaRepository<Concert, Long> {
}
