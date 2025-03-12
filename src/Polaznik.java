public class Polaznik implements Comparable<Polaznik>{
    private int dob;
    private String ime;
    private String prezime;

    public Polaznik(int dob, String ime, String prezime) {
        this.dob = dob;
        this.ime = ime;
        this.prezime = prezime;
    }

    @Override
    public int compareTo(Polaznik o) {
         return Integer.compare(this.dob, o.dob);
    }

    @Override
    public String toString() {
        return ime + " " + prezime + " " + dob;
    }
}
