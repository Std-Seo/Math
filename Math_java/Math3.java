import java.util.ArrayList;

public class math3 {
    public static void main(String[] args) {
      // num의 약수의 개수, 총합 구하기
          int num = 36;
          int count = 0;    // 약수의 개수
          int sum = 0;      // 약수의 총합
           ArrayList list = new ArrayList();    // num의 약수를 넣을 ArrayList 생성
          for(int i = 1; i <= num; i++) {       // 1 ~ num까지
              if(num % i == 0) {                // num / i의 나머지 값이 0이라면
                    list.add(i);                // list에 i를 추가(약수)
                }
          }
          for(int i = 1; i <= list.size(); i++) {   // list에 있는 약수의 개수만큼 count 증가
              count++;
          }
          for(int i = 0; i <= list.size() - 1; i++) {   // list에 있는 수를 sum에 더해감
              sum += (int)list.get(i);
          }
          System.out.println(num + "의 약수의 개수 : " + count);
          System.out.println(num + "의 약수의 총합 : " + sum);
      }
 }
