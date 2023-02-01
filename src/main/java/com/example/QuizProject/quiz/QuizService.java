package com.example.QuizProject.quiz;

import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Service
public class QuizService {

    @Autowired
    private QuizRepository quizRepository;


    @Autowired
    Quiz quiz1;
    public void save(Quiz quiz1) {
        quizRepository.save(quiz1);
    }

    public Quiz getQuiz(Integer id) {
        Quiz quiz = quizRepository.findById(id).get();
        return quiz;
    }

    public void createQuestion(){
        quiz1.setId(1);
        quiz1.setQuizText("Was ist das größte Land?");
        quiz1.setOptionElse1("China");
        quiz1.setOptionRight("Russland");
        quiz1.setOptionElse2("Kanada");
        quiz1.setOptionElse3("Brasilien");
        quizRepository.save(quiz1);
    }

}

