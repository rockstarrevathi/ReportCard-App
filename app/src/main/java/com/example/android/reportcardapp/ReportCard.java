package com.example.android.reportcardapp;

/**
 * Created by samsrutidash on 6/29/2016.
 */
public class ReportCard {
    private String subjectName;
    private int subjectIcon;
    private String grade;

    public ReportCard() {
        super();
    }

    public String getSubjectName() {
        return subjectName;
    }
    public void setSubjectName(String subjectName){
        this.subjectName = subjectName;
    }

    public String getGrade() {
        return this.grade;
    }
    public void setGrade(String grade){
        this.grade = grade;
    }

    public int getSubjectIcon() {
        return this.subjectIcon;
    }
    public void setSubjectIcon(int subjectIcon){
        this.subjectIcon = subjectIcon;
    }

    public ReportCard(int icon, String subjectName, String grade) {
        super();
        this.subjectIcon = icon;
        this.subjectName = subjectName;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Your Child got \n" + grade + " Grade in " + subjectName;
    }
}


