package com.springboot.project.Option;


import com.springboot.project.Quiz.Quiz;
import jakarta.persistence.*;

@Entity
@Table(name ="option")
public class Option {

        @Id
        @GeneratedValue
        private Integer id;
        private String optionText;

        @ManyToOne
        @JoinColumn(name ="quiz_id")
        private Quiz quiz;


        public Integer getId() {
                return id;
        }

        public void setId(Integer id) {
                this.id = id;
        }

        public String getOptionText() {
                return optionText;
        }

        public void setOptionText(String optionText) {
                this.optionText = optionText;
        }

        public Quiz getQuiz() {
                return quiz;
        }

        public void setQuiz(Quiz quiz) {
                this.quiz = quiz;
        }


}
