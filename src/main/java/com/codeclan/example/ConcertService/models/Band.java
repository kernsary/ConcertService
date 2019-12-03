package com.codeclan.example.ConcertService.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name = "bands")
public class Band {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @ManyToOne
    @JoinColumn(name = "concert_id", nullable = false)
    private Concert concert;

    @JsonIgnoreProperties("band")
    @ManyToMany
    @JoinTable(
            name = "bands-musicians",
            joinColumns = {@JoinColumn(
                    name = "band_id",
                    nullable = false,
                    updatable = false
            )},
            inverseJoinColumns = {@JoinColumn(
                    name = "musician-id",
                    nullable = false,
                    updatable = false
            )}
    )
    private ArrayList<Musician> musicians;

    public Band(String name, Concert concert) {
        this.name = name;
        this.concert = concert;
        this.musicians = new ArrayList<>();
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

    public ArrayList<Musician> getMusicians() {
        return musicians;
    }

    public void addMusician(Musician musician) {
        musicians.add(musician);
    }
}
