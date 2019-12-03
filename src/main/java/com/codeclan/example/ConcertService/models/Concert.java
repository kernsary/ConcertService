package com.codeclan.example.ConcertService.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "concerts")
public class Concert {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @JsonIgnoreProperties("concert")
    @OneToMany(mappedBy = "concert")
    private List<Band> bands;

    public Concert(String name) {
        this.name = name;
        this.bands = new ArrayList<>();
    }

    public Concert(){
    }

    public Long getId(){
        return id;
    }

    public String getName() {
        return name;
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

    public void setBands(List<Band> bands) {
        this.bands = bands;
    }

    public void addBand(Band band) {
        bands.add(band);
    }
}
