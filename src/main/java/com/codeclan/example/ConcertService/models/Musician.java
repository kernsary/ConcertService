package com.codeclan.example.ConcertService.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name = "musicians")
public class Musician {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String instrument;

    @JsonIgnoreProperties("musician")
    @ManyToMany
    @JoinTable(
            name = "bands-musicians",
            joinColumns = {@JoinColumn(
                    name = "musician_id",
                    nullable = false,
                    updatable = false
            )},
            inverseJoinColumns = {@JoinColumn(
                    name = "band_id",
                    nullable = false,
                    updatable = false
            )}
    )
    private ArrayList<Band> bands;


    public Musician(String name, String instrument) {
        this.name = name;
        this.instrument = instrument;
        this.bands = new ArrayList<>();
    }

    public Long getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public String getInstrument() {
        return instrument;
    }

    public ArrayList<Band> getBands() {
        return bands;
    }

    public void addBand(Band band){
        bands.add(band);
    }

}
