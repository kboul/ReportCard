package com.example.android.reportcard;

import static android.R.attr.name;
import static android.R.id.message;

public class ReportCard {

    // Declare variables
    private String studentName;
    private int mathGrade;
    private int informaticsGrade;
    private int languageGrade;
    private int physicsGrade;
    private int chemistryGrade;

    // Constructor
    public ReportCard(
            String studentName,
            int mathGrade,
            int informaticsGrade,
            int languageGrade,
            int physicsGrade,
            int chemistryGrade) {

        this.studentName = studentName;
        this.mathGrade = mathGrade;
        this.informaticsGrade = informaticsGrade;
        this.languageGrade = languageGrade;
        this.physicsGrade = physicsGrade;
        this.chemistryGrade = chemistryGrade;
    }

    // Getter method for student name
    public String getStudentName() {
        return studentName;
    }

    // Setter method for student name
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    // Getter method for math grade
    public int getMathGrade() {
        return mathGrade;
    }

    // Setter method for math grade
    public void setMathGrade(int mathGrade) {
        this.mathGrade = mathGrade;
    }

    // Getter method for informatics grade
    public int getInformaticsGrade() {
        return informaticsGrade;
    }

    // Setter method for informatics grade
    public void setInformaticsGrade(int informaticsGrade) {
        this.informaticsGrade = informaticsGrade;
    }

    // Getter method for language grade
    public int getLanguageGrade() {
        return languageGrade;
    }

    // Setter method for language grade
    public void setLanguageGrade(int languageGrade) {
        this.languageGrade = languageGrade;
    }

    // Getter method for physics grade
    public int getPhysicsGrade() {
        return physicsGrade;
    }

    // Setter method for physics grade
    public void setPhysicsGrade(int physicsGrade) {
        this.physicsGrade = physicsGrade;
    }

    // Getter method for chemistry grade
    public int getChemistryGrade() {
        return chemistryGrade;
    }

    // Setter method for chemistry grade
    public void setChemistryGrade(int chemistryGrade) {
        this.chemistryGrade = chemistryGrade;
    }

    // Get grade
    public String getGrade(int mathGrade,
                           int informaticsGrade,
                           int languageGrade,
                           int physicsGrade,
                           int chemistryGrade) {

        double average = (mathGrade + informaticsGrade + languageGrade + physicsGrade + chemistryGrade) / 5;

        if (average >= 9) {
            return "Excellent";
        } else if (average < 9 && average >= 7) {
            return "Very Good";
        } else if (average < 7 && average >= 5) {
            return "Good";
        } else if (average < 5) {
            return "Fail";
        } else {
            return "Something went wrong";
        }
    }

    @Override
    public String toString() {
        return "Student Name: " + studentName + "\n" +
                "Math Grade: " + mathGrade + "\n" +
                "Informatics Grade: " + informaticsGrade + "\n" +
                "Language Grade: " + languageGrade + "\n" +
                "Physics Grade: " + physicsGrade + "\n" +
                "Chemistry Grade: " + chemistryGrade + "\n" +
                "Grade: " + getGrade(mathGrade, informaticsGrade, languageGrade, physicsGrade, chemistryGrade);
    }
}
