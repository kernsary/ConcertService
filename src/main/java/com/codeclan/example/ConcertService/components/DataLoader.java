package com.codeclan.example.ConcertService.components;

import com.codeclan.example.ConcertService.models.Band;
import com.codeclan.example.ConcertService.models.Concert;
import com.codeclan.example.ConcertService.models.Musician;
import com.codeclan.example.ConcertService.repositories.BandRepository;
import com.codeclan.example.ConcertService.repositories.ConcertRepository;
import com.codeclan.example.ConcertService.repositories.MusicianRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    ConcertRepository concertRepository;

    @Autowired
    BandRepository bandRepository;

    @Autowired
    MusicianRepository musicianRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args) {
        Concert concert = new Concert("Feis");
        concertRepository.save(concert);

        Band solas = new Band("Solas", concert);
        bandRepository.save(solas);

        Band birlinn = new Band("Birlinn", concert);
        bandRepository.save(birlinn);

        Musician alan = new Musician("Alan", "guitar");
        musicianRepository.save(alan);

        Musician niamh = new Musician("Niamh", "fiddle");
        musicianRepository.save(niamh);

        Musician joanne = new Musician("Joanne", "accordion");
        musicianRepository.save(joanne);

        niamh.addBand(solas);
        niamh.addBand(birlinn);
        musicianRepository.save(niamh);

        solas.addMusician(alan);
        birlinn.addMusician(joanne);
        bandRepository.save(solas);
        bandRepository.save(birlinn);

    }
}
