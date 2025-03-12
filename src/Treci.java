import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Treci {
    public static void main(String[] args) {
        List<Polaznik> polaznici = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            polaznici.add(new Polaznik(random.nextInt(20,120),"ime"+i, "prezime"+i));
        }

        polaznici.sort(Polaznik::compareTo);
        polaznici.forEach(System.out::println);
    }
}
