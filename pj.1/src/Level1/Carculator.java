package Level1;

import java.util.Scanner;

public class Carculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("첫 번째 숫자를 입력하세요: ");
        double num1 =sc.nextDouble();
        System.out.println("두 번째 숫자를 입력하세요: ");
        double num2 =sc.nextDouble();

        System.out.println("사칙 연산기호을 입력하세요: ");
        char ch =sc.next().charAt(0);

        double result = 0;

        switch(ch){
            case '+': result = num1 + num2;
            break;
            case '-': result = num1 - num2;
            break;
            case '*': result = num1 * num2;
            break;
            case '/':
                if(num2 != 0){
                    result = num1 / num2;
                }else{
                    System.out.println("나눗셈 연산에서 분모에는 0을 입력 할 수 없습니다");
                }
            break;

        }






    }



}
