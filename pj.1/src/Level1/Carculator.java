package Level1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Carculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;

        String remove = "remove";
        String out = "exit";
//        int[] arr = new int[10];
//        int count = 0;


        Queue<Integer> q= new LinkedList<>();


        /* 연산의 결과를 저장할 수 있도록 적합한 타입의 배열을 생성합니다. */
        /* 연산의 결과가 저장된 배열의 마지막 index를 저장하는 변수를 선언 */
//        double[] arr = new double[10];
//        int count = 0;

        while (true) {
            System.out.println("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            System.out.println("사칙 연산기호을 입력하세요: ");
            char ch = sc.next().charAt(0);
            System.out.println("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();



            switch (ch) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("나눗셈 연산에서 분모에는 0을 입력 할 수 없습니다");
                    }
                    break;
                case '%':

            }
//            arr[count] = result;
//            count +=1;
//            for(count = 0 ; count < 9 ; count++){
//
//            System.out.println(arr[count] + " ");}
            q.offer(result);
            for(Integer resarr:q){
                System.out.println(resarr + " ");
            }

            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제) :");
            String input = sc.next();
            if(input.equals(remove)) {
                q.remove(q.peek());
                System.out.println("삭제합니다");
               
            }

            System.out.println("exit 입력 시 종료합니다");
            String input2 = sc.next();

            if(input2.equals(out)){
                System.out.println("종료합니다");
                break;
            }else {continue;}

        }






    }



}
