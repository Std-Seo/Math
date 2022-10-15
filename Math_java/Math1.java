public class math1 {
    public static void main(String[] args) {

        // 2x + y = 5를 만족시키는 x, y의 순서쌍
        int x, y;
        for(x = 0; x <= 5; x++) {
            for(y = 0; y <= 5; y++) {
                if(2 * x + y == 5) {
                    System.out.println("(" + x + "," + y + ")");
                }
            }
        }
        System.out.println("");

        // a + 4b = 10을 만족시키는 a, b의 순서쌍
        int a, b;
        for(a = 0; a <= 10; a++) {
            for(b = 0; b <= 10; b++) {
                if(a + 4 * b == 10) {
                    System.out.println("(" + a + "," + b + ")");
                }
            }
        }
        System.out.println("");

        // c + d <= 4를 만족시키는 c, d의 순서쌍
        int c, d;
        for(c = 1; c <= 4; c++) {
            for(d = 1; d <= 4; d++) {
                if(c + d <= 4) {
                    System.out.println("(" + c + "," + d + ")");
                }
            }
        }
        System.out.println("");
    }
}
