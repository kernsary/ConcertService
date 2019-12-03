package com.codeclan.example.ConcertService;

import com.codeclan.example.ConcertService.repositories.BandRepository;
import com.codeclan.example.ConcertService.repositories.ConcertRepository;
import com.codeclan.example.ConcertService.repositories.MusicianRepository;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ConcertServiceApplicationTests {

	@Autowired
	ConcertRepository concertRepository;

	@Autowired
	BandRepository bandRepository;

	@Autowired
	MusicianRepository musicianRepository;

	@Test
	public void contextLoads() {
	}

}
