package ca.kgb.simpleunittest;

/**
 * Created by admin on 8/16/2016.
 */
public class CalculatorHelper {
    public int sumItems(int number1, int number2){
        return number1+number2;
    }
    public int absDifferenceItems(int number1, int number2){
        int result = sumItems(number1,-number2);
        if(result<0) result = -result;
        return result;
    }
    public int multiplyItems(int number1, int number2){
        if(number1 ==0 || number2 == 0)return 0;
       int sum = number1;
        for (int i = 1; i < number2; i++) {
            sum += number1;
        }
        return sum;
    }
    public int powerItems(int number1, int power){
        int sum =number1;
        for (int i = 1; i < power; i++) {
            sum = multiplyItems(sum, number1);
        }
        if (power%2 == 0 && sum<0) sum = -sum;
        return sum;
    }

}
