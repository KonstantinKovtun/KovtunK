package ru.job4j.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Class Student. This class describes how we can filter data's.
 * @author Kovtun Konstantin (kovtun.kostya@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Student {
    private int score;
    private String surname;

    public Student(int score, String surname) {
        this.score = score;
        this.surname = surname;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return this.score;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return this.surname;
    }

    @Override
    public String toString() {
        return "{"
                +
                "Surname='"
                + surname
                + '\''
                +
                ", score="
                + score
                +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Student)) {
            return false;
        }

        Student student = (Student) obj;

        return this.getSurname().equals(student.getSurname());
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + score;
        result = prime * result + ((surname == null) ? 0 : surname.hashCode());
        return result;
    }
}
