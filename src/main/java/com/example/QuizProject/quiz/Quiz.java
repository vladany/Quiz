package com.example.QuizProject.quiz;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.context.annotation.Bean;
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


}
