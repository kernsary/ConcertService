package com.codeclan.example.ConcertService.repositories;

import com.codeclan.example.ConcertService.models.Band;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BandRepository extends JpaRepository<Band, Long> {
}
