import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
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