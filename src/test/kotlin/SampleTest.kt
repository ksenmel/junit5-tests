import Numbers.isOdd

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

class SampleTest {

    /** @ValueSource annotation */
    @ParameterizedTest
    @ValueSource(ints = [1, 3, 5, -3, 15, 27])
    fun isOdd_ShouldReturnTrueForOddNumbers(number: Int) {
        assertTrue(isOdd(number))
    }


}
