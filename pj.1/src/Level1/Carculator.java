package Level1;

import java.util.Scanner;

public class Carculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double result =0 ;
        String out = "exit";


        while (true) {
            System.out.println("첫 번째 숫자를 입력하세요: ");
            double num1 = sc.nextDouble();
            System.out.println("사칙 연산기호을 입력하세요: ");
            char ch = sc.next().charAt(0);
            System.out.println("두 번째 숫자를 입력하세요: ");
            double num2 = sc.nextDouble();








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

            }
            System.out.println("결과: " + result);
            System.out.println("exit 입력 시 종료합니다");
            String input = sc.next();
            if(input.equals(out)){
                System.out.println("종료합니다");
                break;
            }

        }






    }



}
