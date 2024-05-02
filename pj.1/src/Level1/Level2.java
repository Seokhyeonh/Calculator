package Level1;

import java.util.LinkedList;
import java.util.Queue;

public class Level2 {
        Queue<Integer> q = new LinkedList<>();
    public Queue<Integer> getQ() {
        return q;
    }

    public int lv2(int num1, int num2, char ch) {
            int result = 0;


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
                        throw new ArithmeticException("나눗셈 연산에서 분모에는 0을 입력 할 수 없습니다");
                    }
                    break;
                case '%':
                    result = num1 % num2;
                    break;
                default:
                    throw new UnsupportedOperationException("올바른 연산자를 입력해주세요");
            }
            q.offer(result);
            return result;
        }

}
