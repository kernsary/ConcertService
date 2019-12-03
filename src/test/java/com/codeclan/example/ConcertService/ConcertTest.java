//package com.codeclan.example.ConcertService;
//
//import com.codeclan.example.ConcertService.models.Band;
//import com.codeclan.example.ConcertService.models.Concert;
//import org.aspectj.lang.annotation.Before;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;
//
//import java.util.ArrayList;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class ConcertTest {
//
//    private Concert concert;
//    private Band solas;
//    private Band birlinn;
//    private ArrayList<Band> bands;
//
//    @BeforeAll
//    public void before(){
//
//        concert = new Concert("Feis");
//        solas = new Band("Solas", concert);
//        birlinn = new Band("Birlinn", concert);
//        bands = new ArrayList<>();
//
//    }
//
//    @Test
//    public void canGetName(){
//        assertEquals("Feis", concert.getName());
//    }
//
//    @Test
//    public void canGetBands(){
//        assertEquals(0, concert.getBands().size());
//    }
//
//    @Test
//    public void canAddBand(){
//        concert.addBand(solas);
//        assertEquals(1, concert.getBands().size());
//    }
//
//}
