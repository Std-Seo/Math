public class math2 {
    public static void main(String[] args) {
    // 30 ~ 99 중 짝수의 개수 구하기
        int count = 0;  // 짝수의 개수
        for(int i = 30; i <= 99; i++) {     // 30 ~ 99까지
            if(i % 2 == 0) {        // i / 2의 나머지가 0이라면
                count++;    // 짝수의 개수 증가
            }
        }
        System.out.println("짝수의 개수 : " + count + "가지");

    // 20 ~ 69 중 5의 배수의 개수 구하기
        int cnt = 0;    // 5의 배수의 개수
        for(int i = 20; i < 70; i++) {      // 20 ~ 69까지
            if(i % 5 == 0) {        // i / 5의 나머지가 0이라면
                cnt++;      // 5의 배수의 개수 증가
            }
        }
        System.out.println("5의 배수의 개수 : " + cnt + "가지");
     }
}
