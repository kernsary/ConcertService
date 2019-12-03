package com.codeclan.example.ConcertService.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "bands")
public class Band {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "concert_id", nullable = false)
    private Concert concert;

    @JsonIgnoreProperties("band")
    @ManyToMany
    @JoinTable(
            name = "bands_musicians",
            joinColumns = {@JoinColumn(
                    name = "band_id",
                    nullable = false,
                    updatable = false
            )},
            inverseJoinColumns = {@JoinColumn(
                    name = "musician_id",
                    nullable = false,
                    updatable = false
            )}
    )
    private List<Musician> musicians;
//
    public Band(String name, Concert concert) {
        this.name = name;
        this.concert = concert;
        this.musicians = new ArrayList<>();
    }

    public Band(){

    }

    public Long getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public Concert getConcert() {
        return concert;
    }

    public List<Musician> getMusicians() {
        return musicians;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setConcert(Concert concert) {
        this.concert = concert;
    }

    public void setMusicians(List<Musician> musicians) {
        this.musicians = musicians;
    }

    public void addMusician(Musician musician) {
        musicians.add(musician);
    }
}
