package com.springboot.project.Quiz;


import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Service
public class QuizService {

    @Autowired
    private QuizRepository quizRepository;

    public void save(Quiz quiz) {
        quizRepository.save(quiz);
    }

    public Quiz getQuiz(Integer id) {
        Quiz quiz = quizRepository.findById(id).get();
        return quiz;
    }

    public void createQuestion(){
        Quiz quiz = new Quiz();
        quiz.setId(1);
        quiz.setQuizText("Was ist das größte Land?");
        quiz.setLvl(1);
        quizRepository.save(quiz);
    }

}

