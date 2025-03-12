public class Drugi {
    public static void main(String[] args) {
        iscrtaj(10,10);
    }
    public static void iscrtaj(int x, int y) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if((i&1) ==0) {
                    System.out.print("*");
                } else {
                    System.out.print("o");
                }
            }
            System.out.println();
        }
    }
}
