package com.codeclan.example.ConcertService.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "musicians")
public class Musician {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "instrument")
    private String instrument;

    @JsonIgnoreProperties("musician")
    @ManyToMany
    @JoinTable(
            name = "bands_musicians",
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
    private List<Band> bands;


    public Musician(String name, String instrument) {
        this.name = name;
        this.instrument = instrument;
        this.bands = new ArrayList<>();
    }

    public Musician(){

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

    public List<Band> getBands() {
        return bands;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public void setBands(List<Band> bands) {
        this.bands = bands;
    }

    public void addBand(Band band){
        bands.add(band);
    }

}
