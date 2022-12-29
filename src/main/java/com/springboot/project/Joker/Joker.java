package com.springboot.project.Joker;

import com.springboot.project.Game.Game;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Joker {

    @Id
    private Integer id;

    private String jokerTyp;

    private Boolean used;

    private String jokerDescription;
   public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJokerTyp() {
        return jokerTyp;
    }

    public void setJokerTyp(String jokerTyp) {
        this.jokerTyp = jokerTyp;
    }

    public Boolean getUsed() {
        return used;
    }

    public void setUsed(Boolean used) {
        this.used = used;
    }

    public String getJokerDescription() {
        return jokerDescription;
    }

    public void setJokerDescription(String jokerDescription) {
        this.jokerDescription = jokerDescription;
    }

    @Override
    public String toString() {
        return "Joker{" +
                "id=" + id +
                ", jokerTyp='" + jokerTyp + '\'' +
                ", used=" + used +
                '}';
    }

}
