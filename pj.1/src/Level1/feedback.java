package Level1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class feedback {

    public static void main(String[] args) {

        Level2 level2 = new Level2(new LinkedList<>(), new LinkedList<>());

        Scanner sc = new Scanner(System.in);


        String remove = "remove";
        String exit = "exit";
        String inquiry = "inquiry";



        /* 연산의 결과를 저장할 수 있도록 적합한 타입의 배열을 생성합니다. */
        /* 연산의 결과가 저장된 배열의 마지막 index를 저장하는 변수를 선언 */
//        double[] arr = new double[10];
//        int count = 0;

        do {
            System.out.println("어떤 계산을 하시겠습니까? (1:사칙연산, 2:원의 넓이");
            int choice = sc.nextInt();
            if (choice == 1) {}


            System.out.println("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            System.out.println("사칙 연산기호을 입력하세요: ");
            char ch = sc.next().charAt(0);
            System.out.println("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();

            int results = level2.lv2(num1, num2 ,ch);
            int result = results;
            System.out.print("결과: " + results);
            System.out.println();
            level2.getQ().offer(result);

            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제) :");
            String input = sc.next();
            if (input.equals(remove)) {
              level2.removeResult(results);

            }
            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            String input2 = sc.next();
            if (input2.equals(inquiry)) {
               level2.inquiryResult(result);
            }else{
                System.out.println("원의 반지름을 입력하세요");
                int radius = sc.nextInt();

                double area = level2.calculateCircleArea(radius);
                level2.getCircleresults().add(area);
                System.out.println("반지름이"+ radius + "인 원의 넓이는 :" + area);
                System.out.println("지정된 원의 넓이 전체 조회");
                level2.inquiryCircleresults();
            }

            System.out.println("exit 입력 시 종료합니다");
            String input3 = sc.next();
            if (input3.equals(exit)) {
                System.out.println("종료합니다");
                break;
            }
        }while (!sc.next().equals(exit));
    }
}




