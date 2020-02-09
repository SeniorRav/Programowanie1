package threads.ZadanieBank;

public class Rachunek {
    private String typ;
    private long stanRachunku;

    public Rachunek(String typ, long stanRachunku) {
        this.typ = typ;
        this.stanRachunku = stanRachunku;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public long getStanRachunku() {
        return stanRachunku;
    }

    public void setStanRachunku(long stanRachunku) {
        this.stanRachunku = stanRachunku;
    }
}
