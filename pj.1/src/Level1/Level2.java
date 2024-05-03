package Level1;

import java.util.LinkedList;
import java.util.Queue;

public class Level2 {
    private static final double PI = 3.14;
    int result = 0;
    private  Queue<Integer> q = new LinkedList<>();
    private  Queue<Double> circleresults = new LinkedList<>();
    public Level2(){

    }
    public Level2(Queue<Integer> q, Queue<Double>circleresults){
        this.q = q;
        this.circleresults = circleresults;
    }



    public int lv2(int num1, int num2, char ch) {



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
            return result;
        }
        public double calculateCircleArea(int radius){
            return  3.14 * radius + radius;
        }
    public Queue<Integer> getQ() {

        return q;
    }

    public void setQ(Queue<Integer> q) {
        this.q = q;
    }


    public void removeResult(int q){
        this.q.remove(q);
    }
    public void inquiryResult(int q){
        for(Integer result :this. q );
        System.out.println("연산 결과 :" +  result);
    }
    public Queue<Double> getCircleresults() {
        return circleresults;
    }

//    public void setCircleresults(Queue<Integer> circleresults) {
//        this.circleresults = circleresults;
//    }
    public void inquiryCircleresults() {
        for(Double circleresults : circleresults ) {
            System.out.println("원의 넓이 =" + circleresults);
        }

    }


}
