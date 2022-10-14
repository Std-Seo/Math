public class math1 {
    public static void main(String[] args) {

        // 2번 프린트 문제 6번 - 2 * x + y가 5인 x, y의 순서쌍
        int x, y;
        for(x = 0; x <= 5; x++) {
            for(y = 0; y <= 5; y++) {
                if(2 * x + y == 5) {
                    System.out.println("(" + x + "," + y + ")");
                }
            }
        }
        System.out.println("");

        // 2번 프린트 문제 7번 - a + 4 * b가 10인 a, b의 순서쌍
        int a, b;
        for(a = 0; a <= 10; a++) {
            for(b = 0; b <= 10; b++) {
                if(a + 4 * b == 10) {
                    System.out.println("(" + a + "," + b + ")");
                }
            }
        }
        System.out.println("");

        // 2번 프린트 문제 8번 - c + d가 4 이하인 c, d의 순서쌍
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