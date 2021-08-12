import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    Calculator calculator;

    @BeforeEach
    public void  setUp(){
        calculator= new Calculator();
    }

    @Test
public void addTest() {
        //Arrange
    Calculator calculator = new Calculator();
    // Act
    int actual = calculator.addNumbers(10,20);

    //Assert
    int expected = 30;
   assertEquals(30,actual);


    }

    @Test
    public void testForFindMaxNumber(){
        int actualResult = calculator.findMaxNumber(new int[]{1,2,3});
        int expectedResult = 3;
        assertEquals(expectedResult,actualResult);

        int act2 = calculator.findMaxNumber(new int[]{-12, -5, -7, -4, -1});
        int exp2 = -1;
        assertEquals(exp2, act2);
    }

    @Test
    public void testForGetCube(){
        int actualResult = calculator.getCube(3);
        int expectedResult = 27;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testForReverseString(){
        assertEquals("cba", calculator.reverseString("abc"));
    }

    @Test
    public void testForMultiplyTwoNumber(){
  int result =  calculator.multiplyTwoNumber(20,30);
        assertEquals(600, result);
    }

}
