import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class AdderTest {

    //Посчитаем что-то простое для начала. Например: 1 + 1
    @Test
    fun testSumPositiveNumbersOneAndOne() {
        val adder: Adder = AdderImpl()
        assertEquals(2, adder.add(1, 1))
    }

    //Уcложним до 3 + 1
    @Test
    fun testSumPositiveNumbersOneAndTwo() {
        val adder: Adder = AdderImpl()
        assertEquals(4, adder.add(1, 3))
    }

    //Больше тестов!!
    @Test
    fun testSumPositiveNumbersTwoAndTwo() {
        val adder: Adder = AdderImpl()
        assertEquals(10, adder.add(5, 5))
    }

    //А если кинуть в программу нули?
    @Test
    fun testSumZeroNeutral() {
        val adder: Adder = AdderImpl()
        assertEquals(0, adder.add(0, 0))
    }

    //Попробуем посчитать сумму отрицательных чисел
    @Test
    fun testSumNegativeNumbers() {
        val adder: Adder = AdderImpl()
        assertEquals(-3, adder.add(-1, -2))
    }

    //Сложим отрицательные и положительные числа
    @Test
    fun testSumPositiveAndNegative() {
        val adder: Adder = AdderImpl()
        assertEquals(0, adder.add(-1, 1))
    }

    //Давайте теперь разберемся с большими числами!
    @Test
    fun testSumLargeNumbers() {
        val adder: Adder = AdderImpl()
        assertEquals(2222, adder.add(1234, 988))
    }
}
