package com.example.QuizProject.quiz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class QuizService {

    @Autowired
    private QuizRepository quizRepository;
    @Autowired
    private Quiz quiz;
    public void save(Quiz quiz) {

        quizRepository.save(quiz);
    }

    public Quiz getQuiz(Integer id) {
        Quiz quiz = quizRepository.findById(id).get();
        return quiz;
    }

    public void createQuestion() {

        ArrayList<Quiz> frage = new ArrayList<>();
        Quiz frage1 = new Quiz(1, "Was echt?", "a", "b", "c", "d");
        Quiz frage2 = new Quiz(2, "Wie", "a", "b", "c", "d");
        Quiz frage3 = new Quiz(3, "Wo", "a", "b", "c", "d");
        Quiz frage4 = new Quiz(4, "Warum", "a", "b", "c", "d");
        Quiz frage5 = new Quiz(5, "Ich hab", "a", "b", "c", "d");
        Quiz frage6 = new Quiz(6, "Kp", "a", "b", "c", "d");

        frage.add(frage1);
        frage.add(frage2);
        frage.add(frage3);
        frage.add(frage4);
        frage.add(frage5);
        frage.add(frage6);


        quizRepository.save(frage1);
        quizRepository.save(frage2);
        quizRepository.save(frage3);
        quizRepository.save(frage4);
        quizRepository.save(frage5);
        quizRepository.save(frage6);

    }

//    public void createQuestion(){
//        quiz1.setId(1);
//        quiz1.setQuizText(QuestionsLevel1.txt11);
//        quiz1.setOptionElse1(QuestionsLevel1.opt12);
//        quiz1.setOptionRight(QuestionsLevel1.optR15);
//        quiz1.setOptionElse2(QuestionsLevel1.opt13);
//        quiz1.setOptionElse3(QuestionsLevel1.opt14);
//        quizRepository.save(quiz1);
//    }

}

