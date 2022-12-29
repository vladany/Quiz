package com.springboot.project.Quiz;

import com.springboot.project.Option.Option;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name ="quiz")
public class Quiz {
    @Id
    @GeneratedValue
    private Integer id;

    private String quizText;
    private Integer lvl;

    @OneToMany
    private List<Option> options;


    public List<Option> getOptions(Option option1) {
        return options;
    }

    public void setOptions(List<Option> options) {
        this.options = options;
    }

    public Quiz quiz() {
        System.out.println(quizText);
        return quiz();
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQuizText() {
        return quizText;
    }

    public void setQuizText(String quizText) {
        this.quizText = quizText;
    }

    public Integer getLvl() {
        return lvl;
    }

    public void setLvl(Integer lvl) {
        this.lvl = lvl;
    }


}
