import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.*
import java.util.stream.Stream

class AdderParameterizedTest {

    @ParameterizedTest
    @MethodSource("getArgumentsForTest")
    fun testSum(a: Int, b: Int, sum: Int) {
        val adder: Adder = AdderImpl()
        val result: Int = adder.add(a, b)
        assertEquals(sum, result)
    }
    companion object {
        @JvmStatic
        fun getArgumentsForTest(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(1, 1, 2),
                Arguments.of(3, 4, 7),
                Arguments.of(0, 1, 1),
                Arguments.of(0, 0, 0),
                Arguments.of(-1, -5, -6),
                Arguments.of(-1, 1, 0),
                Arguments.of(1786, 564, 2350)
            )
        }
    }
}


