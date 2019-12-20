package quiz;

import java.util.Scanner;

public class Sporgsmaal implements Translateable {

    private String spoergsMaal;

    private int point;

    private String svar[];

    private int rigtigSvarIndex;
    /** SporgsMaal constructer*/
    public Sporgsmaal(String spoergsMaalFraQuiz, int point, String[] svar, int rigtigSvarIndex) {
        this.spoergsMaal = spoergsMaalFraQuiz;
        this.point = point;
        this.svar = svar;
        this.rigtigSvarIndex = rigtigSvarIndex;
    }

    public String getSpoergsMaal() {
        return spoergsMaal;
    }

    public void setSpoergsMaal(String spoergsMaal) {
        if (spoergsMaal.length() < 100){
        this.spoergsMaal = spoergsMaal;

        } else {
            throw new IllegalArgumentException("Spørgsmål må maks være 100 tegn");
        }
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        if (point < 100) {
            this.point = point;
        } else  {
            throw new IllegalArgumentException("Du har fået over 100 point, quizzen er slut!");
        }
        this.point = point;
    }

    public String[] getSvar() {
        return svar;
    }

    public void setSvar(String[] svar) {
        this.svar = svar;
    }

    public int getRigtigSvarIndex() {
        return rigtigSvarIndex;
    }

    public void setRigtigSvarIndex(int rigtigSvarIndex) {
        this.rigtigSvarIndex = rigtigSvarIndex;
    }
}


