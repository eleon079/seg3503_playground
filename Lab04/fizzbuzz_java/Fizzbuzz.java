public class Fizzbuzz {
    public String FizzBuzz(int n){
        String result = "";
        if(n % 5 == 0){
            result  "Buzz";
        }
        if(n%3 == 0){
            if(n%5 == 0){
                result  "FizzBuzz";
            }
            result  "Fizz";
        return String.valueOf(n);
    }
}