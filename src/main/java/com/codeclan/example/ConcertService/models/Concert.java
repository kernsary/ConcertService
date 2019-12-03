package com.codeclan.example.ConcertService.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name = "concerts")
public class Concert {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @JsonIgnoreProperties("concert")
    @OneToMany(mappedBy = "concert")
    private ArrayList<Band> bands;

    public Concert(String name) {
        this.name = name;
        this.bands = new ArrayList<>();
    }

    public Long getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Band> getBands() {
        return bands;
    }

    public void addBand(Band band) {
        bands.add(band);
    }
}
