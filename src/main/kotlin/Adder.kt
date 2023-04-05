internal interface Adder {
    fun add(a: Int, b: Int): Int
}

internal class AdderImpl: Adder {
    override fun add(a: Int, b: Int): Int {
        return a + b
    }
}
