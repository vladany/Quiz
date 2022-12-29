package com.springboot.project.Game;

import com.springboot.project.Joker.Joker;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    //private Player player;

    private Integer score;

    private String startTime;

    private String endTime;

    @OneToMany
    private List<Joker> jokers;

    @OneToMany
    private List<Quiz>
}
