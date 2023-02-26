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

        // LEVEL 1
        Quiz frage1 = new Quiz(1, "Wie viele Bundeslänger hat Deutschland", "16", "6", "24", "12");
        Quiz frage2 = new Quiz(2, "Was ist der höchste Berg?", "Mount Everest", "Zugspitze", "Mont Blanc", "Dolomiten");
        Quiz frage3 = new Quiz(3, "Wie nennt man ein männliches Schwein?", "Eber", "Erpel", "Bock", "Hengst");
        Quiz frage4 = new Quiz(4, "Wofür stehen die olympischen Ringe?", "Kontinente", "Disziplinen", "Jahreszeiten", "Frieden");

        Quiz frage5 = new Quiz(5, "Welcher Planet ist der Sonne am nähsten?", "Merkur", "Jupiter", "Mars", "Uranus");
        Quiz frage20 = new Quiz(6, "Thats level 2", "16", "6", "24", "12");
        Quiz frage21 = new Quiz(7, "Thats level 2Was ist der höchste Berg?", "Mount Everest", "Zugspitze", "Mont Blanc", "Dolomiten");
        Quiz frage22 = new Quiz(8, "Thats level 2Was versteht man unter einem String?", "Zeichenkette", "Zahlenkette", "Datenkette", "Wahrheitswert");
        Quiz frage23 = new Quiz(9, "Thats level 2Wofür stehen die olympischen Ringe?", "Kontinente", "Disziplinen", "Jahreszeiten", "Frieden");
        Quiz frage24 = new Quiz(10, "Thats level 2Welcher Planet ist der Sonne am nähsten?", "Merkur", "Jupiter", "Mars", "Uranus");

        Quiz frage30 = new Quiz(11, "Thats level 3 Welcher der Inseln gehört nicht zu den Balearischen Inseln?", "Malta", "Cabrera", "Formentera", "Mallorca");
        Quiz frage31 = new Quiz(12, "Thats level 3Was ist der höchste Berg?", "Mount Everest", "Zugspitze", "Mont Blanc", "Dolomiten");
        Quiz frage32 = new Quiz(13, "Thats level 3Wie nennt man ein männliches Schwein?", "Eber", "Erpel", "Bock", "Hengst");
        Quiz frage33 = new Quiz(14, "Thats level 3Wofür stehen die olympischen Ringe?", "Kontinente", "Disziplinen", "Jahreszeiten", "Frieden");
        Quiz frage34 = new Quiz(15, "Thats level 3Welcher Planet ist der Sonne am nähsten?", "Merkur", "Jupiter", "Mars", "Uranus");

        frage.add(frage1);
        frage.add(frage2);
        frage.add(frage3);
        frage.add(frage4);
        frage.add(frage5);

        frage.add(frage20);
        frage.add(frage21);
        frage.add(frage22);
        frage.add(frage23);
        frage.add(frage24);
        // LEVEL 3
        frage.add(frage30);
        frage.add(frage31);
        frage.add(frage32);
        frage.add(frage33);
        frage.add(frage34);

        quizRepository.save(frage1);
        quizRepository.save(frage2);
        quizRepository.save(frage3);
        quizRepository.save(frage4);
        quizRepository.save(frage5);

        quizRepository.save(frage20);
        quizRepository.save(frage21);
        quizRepository.save(frage22);
        quizRepository.save(frage23);
        quizRepository.save(frage24);

        quizRepository.save(frage30);
        quizRepository.save(frage31);
        quizRepository.save(frage32);
        quizRepository.save(frage33);
        quizRepository.save(frage34);
    }
}

