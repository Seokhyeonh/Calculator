package Level1;
    public class level2 {
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
            return result;
        }

}
