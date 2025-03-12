public class Drugi {
    public static void main(String[] args) {
        iscrtaj(10,10);
    }
    public static void iscrtaj(int x, int y) {
        String os = String.valueOf('o').repeat(y);
        String xs = String.valueOf('*').repeat(y);

        for (int i = 0; i < x; i++) {
            System.out.println((i&1)==0 ? xs : os);
        }
    }
}
