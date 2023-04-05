import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import org.junit.jupiter.api.Test

class FibonacciTest {

    @Test
    fun calculateTest_0() {
        val testIndex = 0L
        val expectedResult = 1L
        assertEquals(expectedResult, fibonacci(testIndex))
    }

    @Test
    fun calculateTest_1() {
        val testIndex = 1L
        val expectedResult = 1L
        assertEquals(expectedResult, fibonacci(testIndex))
    }

    @Test
    fun calculateTest_4() {
        val testIndex = 4L
        val expectedResult = 5L
        assertEquals(expectedResult, fibonacci(testIndex))
    }

    @Test
    fun calculateTest_1000() {
        val testIndex = 1000L
        val expectedResult = 107579939L
        assertEquals(expectedResult, fibonacci(testIndex))
    }

    @Test
    fun checkPositiveTest() {
        val testIndex = -1000L
        val expectedResult = -1L
        assertEquals(expectedResult, fibonacci(testIndex))
    }
}

class FibonacciParameterizedTest(){

    @ParameterizedTest
    @CsvSource(
        "0, 1",
        "1, 1",
        "4, 5",
        "1000, 107579939",
        "-1000, -1"
    )

    fun `check for fib number by mod 10^9 + 7`(input: Long, expected: Long?){
        assertEquals(expected, fibonacci(input))
    }
}