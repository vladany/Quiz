package com.example.QuizProject.quiz;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Entity
@Table(name ="quiz")
@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Quiz {
    @Id
    @GeneratedValue
    private Integer id;

    public String quizText;
    public String optionRight;
    public String optionElse1;
    public String optionElse2;
    public String optionElse3;




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

    public String getOptionRight() {
        return optionRight;
    }

    public void setOptionRight(String optionRight) {
        this.optionRight = optionRight;
    }

    public String getOptionElse1() {
        return optionElse1;
    }

    public void setOptionElse1(String optionElse1) {
        this.optionElse1 = optionElse1;
    }

    public String getOptionElse2() {
        return optionElse2;
    }

    public void setOptionElse2(String optionElse2) {
        this.optionElse2 = optionElse2;
    }

    public String getOptionElse3() {
        return optionElse3;
    }

    public void setOptionElse3(String optionElse3) {
        this.optionElse3 = optionElse3;
    }
}
