package øvelse16;

import java.util.Random;

public class ExamQuestion {
    private int number;
    private char grade;

    public ExamQuestion(int number){
        this.number = number;
        Random random = new Random();
        int gradeNum = random.nextInt(6);
        switch (gradeNum){
            case 0 -> grade = 'A';
            case 1 -> grade = 'B';
            case 2 -> grade = 'C';
            case 3 -> grade = 'D';
            case 4 -> grade = 'E';
            case 5 -> grade = 'F';
        }
    }

    public int getNumber() {
        return number;
    }

    public char getGrade(){
        return grade;
    }

}
