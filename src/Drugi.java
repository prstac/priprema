public class Drugi {
    public static void main(String[] args) {
        iscrtaj(10,10);
    }
    public static void iscrtaj(int x, int y) {
        String os = String.valueOf('o').repeat(Math.max(0, y));
        String xs = String.valueOf('*').repeat(Math.max(0, y));

        for (int i = 0; i < x; i++) {
            System.out.println((i&1)==0 ? xs : os);
        }
    }
}
