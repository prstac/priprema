import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Treci {
    public static void main(String[] args) {
        List<Polaznik> polaznici = new ArrayList<>();

        polaznici.add(new Polaznik(20, "Pero", "Peric"));
        polaznici.add(new Polaznik(19, "Mara", "Maric"));
        polaznici.add(new Polaznik(21, "Ivica", "Ivic"));

        Collections.sort(polaznici);

        for (Polaznik polaznik : polaznici) {
            System.out.println(polaznik);
        }
    }
}
