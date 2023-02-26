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
        Quiz frage1 = new Quiz(1, "Wie viele Bundeslänger hat Deutschland", "16", "6", "24", "12");
        Quiz frage2 = new Quiz(2, "Was ist der höchste Berg?", "Mount Everest", "Zugspitze", "Mont Blanc", "Dolomiten");
        Quiz frage3 = new Quiz(3, "Wie nennt man ein männliches Schwein?", "Eber", "Erpel", "Bock", "Hengst");
        Quiz frage4 = new Quiz(4, "Wofür stehen die olympischen Ringe?", "Kontinente", "Disziplinen", "Jahreszeiten", "Frieden");
        Quiz frage5 = new Quiz(5, "Welcher Planet ist der Sonne am nähsten?", "Merkur", "Jupiter", "Mars", "Uranus");
        Quiz frage6 = new Quiz(6, "Was versteht man unter einem String?", "Zeichenkette", "Zahlenkette", "Datenkette", "Wahrheitswert");

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


}

