package com.springboot.project.Quiz;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="quiz")
public class Quiz {
    @Id
    @GeneratedValue
    private Integer id;

    private String quizText;
    private Integer lvl;

    @Override
    public String toString() {
        return "Quiz{" +
                "quizText='" + quizText + '\'' +
                '}';
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
