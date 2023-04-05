import org.junit.jupiter.api.Assertions.*
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
