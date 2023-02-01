package com.example.QuizProject.quiz;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class QuestionsLevel1 {

    public Integer questionsLevel1Id;
    public String objectsAnswer1;
    public String objectsAnswer2;
    public String objectsAnswer3;
    public String objectsAnswerR;




    // Erste Zahl: Nummer der Frage, zweite Zahl: Nummer des Strings


    public static String txt11 = "Wie heißt der deutsche Kanzler?";
    public static String opt12 = "Angela Merkel";
    public  static String opt13 = "Chistian Lindner";
    public  static String opt14 = "Lehmann";
    public  static String optR15 = "Olaf Scholz";

    public static String txt21 = "Wen ruft man wenn es brennt?";
    public static String opt21 = "Mama";
    public static String opt23 = "Papa";
    public static String opt24 = "Angela Merkel";
    public static String opt25 = "Feuerwehr";




}
