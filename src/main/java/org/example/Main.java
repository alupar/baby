package org.example;

import java.sql.Date;

public class Main {
    public static void main(String[] args) {

//  Задача "Книга"
        Book book = new Book();
        book.setTitle("Теллурия");
        book.setAuthor("Сорокин Владимир Георгиевич");
        book.setYearPublished(2013);
        book.display();

// Задача "Студент"
        Student student = new Student();
        student.setName("Жуков Николай Кириллович");
        student.setGradeBook(481041);
        student.setAvgScore(8.12f);
        student.print();

// Задача "Точка на плоскости"
        Point point = new Point();
        point.setX(9);
        point.setY(13);
        point.moveUp();
        point.moveDown();
        point.moveLeft();
        point.moveRight();

// Задача "Часы"
        Clock clock = new Clock();
        clock.setHour(12);
        clock.setMin(56);
        clock.setSec(54);
        clock.tick();
        clock.readTime();

// Задача "Автомобиль"
        Car car = new Car();
        car.setBrandAuto("ВАЗ");
        car.setModelAuto("2110");
        car.setYearAuto(1998);
        car.drive(123);

    }
}