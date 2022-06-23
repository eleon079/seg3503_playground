import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class FizzBuzzTest {
    @Test
    public void test1pass(){
        Fizzbuzz fb = new Fizzbuzz();
        assertEquals("Buzz", fb.FizzBuzz(5));
    }
    @Test

    public void test2pass(){
        Fizzbuzz fb = new Fizzbuzz();
        assertEquals("Fizz", fb.FizzBuzz(3));
    }
    @Test

    public void test3pass(){
        Fizzbuzz fb = new Fizzbuzz();
        assertEquals("FizzBuzz", fb.FizzBuzz(15));
    }
    @Test

    public void test4pass(){
        Fizzbuzz fb = new Fizzbuzz();
        assertEquals("Buzz", fb.FizzBuzz(10));
    }
    //////these tests will fail
    @Test
    public void test1fail(){
        Fizzbuzz fb = new Fizzbuzz();
        assertEquals("Fizz", fb.FizzBuzz(5));

    }
    @Test
    public void test2fail(){
        Fizzbuzz fb = new Fizzbuzz();
        assertEquals("Buzz", fb.FizzBuzz(3));
    }
    @Test
    public void test3fail(){
        Fizzbuzz fb = new Fizzbuzz();
        assertEquals("Buzz", fb.FizzBuzz(15));
    }

}