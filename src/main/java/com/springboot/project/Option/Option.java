package com.springboot.project.Option;


import com.example.QuizProject.quiz.Quiz;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name ="option")
@Data
@NoArgsConstructor
public class Option {

        @Id
        @GeneratedValue
        private Integer id;
        private String optionText;

        @ManyToOne
        @JoinColumn(name ="quiz_id")
        private Quiz quiz;



}
