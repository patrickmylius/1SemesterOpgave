package quiz;

public class Svar implements Translateable {


    String svar;

    public Svar(String korrektSvar) {
        this.svar = korrektSvar;
    }

    public String getSvar() {
        return svar;
    }

    public void setSvar(String svar) {
        this.svar = svar;
    }
}
