import java.util.ArrayList;
import java.util.List;

public class Treci {
    public static void main(String[] args) {
        List<Polaznik> polaznici = new ArrayList<>();

        polaznici.add(new Polaznik(20, "Pero", "Peric"));
        polaznici.add(new Polaznik(19, "Mara", "Maric"));
        polaznici.add(new Polaznik(21, "Ivica", "Ivic"));

        polaznici.sort(Polaznik::compareTo);
        polaznici.forEach(System.out::println);
    }
}
