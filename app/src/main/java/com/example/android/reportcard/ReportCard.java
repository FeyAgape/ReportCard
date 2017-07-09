package com.example.android.reportcard;

/**
 * Created by FEY-AGAPE on 09/07/2017.
 */

public class ReportCard {
    private String schoolName;
    private String studentName;
    private int gradeMathematics;
    private int gradeEnglish;
    private int gradeScience;


    public ReportCard(String school, String name, int gradeM, int gradeE, int gradeS) {
        //Initialize the variables here!
        schoolName = school;
        studentName = name;
        gradeMathematics = gradeM;
        gradeEnglish = gradeE;
        gradeScience = gradeS;
    }

    //Get the School name
    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String school) {
        schoolName = school;
    }

    //Get the Student name
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String name) {
        studentName = name;
    }

    //For the Mathematics grade
    public int getGradeMathematics() {
        return gradeMathematics;
    }

    public void setGradeMathematics(int gradeM) {
        gradeMathematics = gradeM;
    }

    //For the English grade
    public int getGradeEnglish() {
        return gradeEnglish;
    }

    public void setGradeEnglish(int gradeC) {
        gradeEnglish = gradeC;
    }

    //For the Science grade
    public int getGradeScience() {
        return gradeScience;
    }

    public void setGradeScience(int gradeS) {
        gradeScience = gradeS;
    }


    @Override
    public String toString() {
        //The toString() method gives a String representing the data stored in the report card.

        return "School Name: " + schoolName + "\n" +
                "Student Name: " + studentName + "\n" +
                "Mathematics: " + gradeMathematics + "\n" +
                "English: " + gradeEnglish + "\n" +
                "Science: " + gradeScience;
    }
}