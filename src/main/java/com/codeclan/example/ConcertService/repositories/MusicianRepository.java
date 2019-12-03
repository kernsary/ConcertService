package com.codeclan.example.ConcertService.repositories;

import com.codeclan.example.ConcertService.models.Musician;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MusicianRepository extends JpaRepository<Musician, Long> {
}
