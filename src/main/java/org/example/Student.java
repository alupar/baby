package org.example;

public class Student implements Printable {
    private String name;
    private int gradeBook;
    private float avgScore;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGradeBook() {
        return gradeBook;
    }

    public void setGradeBook(int gradeBook) {
        this.gradeBook = gradeBook;
    }

    public float getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(float avgScore) {
        this.avgScore = avgScore;
    }

    @Override
    public void print() {
        System.out.println("**********\nСтудент: " + this.name + "\nНомер зачётки: " + this.gradeBook + "\nСредний бал: " + this.avgScore);

    }
}
