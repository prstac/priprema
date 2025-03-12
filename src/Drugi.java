public class Drugi {
    public static void main(String[] args) {
        iscrtaj(10,10);
    }
    public static void iscrtaj(int x, int y) {
        String os = String.valueOf('o').repeat(Math.max(0, y));
        String xs = String.valueOf('*').repeat(Math.max(0, y));
        for (int i = 0; i < x; i++) {
            if ((i&1)==0) {
                System.out.println(xs);
            } else {
                System.out.println(os);
            }
        }
    }
}
