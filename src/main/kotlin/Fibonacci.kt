fun checkPositive(n: Long): Boolean {
    return (n >= 0)
}

fun fibonacci(n: Long): Long {
    if (!checkPositive(n)) return -1

    val qMatrix = arrayOf(longArrayOf(1, 1), longArrayOf(1, 0))
    val mod = 1000000000 + 7

    fun multiplyMatrix(M1: Array<LongArray>, M2: Array<LongArray>): Array<LongArray> {

        val a11 = M1[0][0] * M2[0][0] % mod + M1[0][1] * M2[1][0] % mod
        val a12 = M1[0][0] * M2[0][1] % mod + M1[0][1] * M2[1][1] % mod
        val a21 = M1[1][0] * M2[0][0] % mod + M1[1][1] * M2[1][0] % mod
        val a22 = M1[1][0] * M2[0][1] % mod + M1[1][1] * M2[1][1] % mod

        return arrayOf(longArrayOf(a11, a12), longArrayOf(a21, a22))
    }

    fun matrixPow(matrix: Array<LongArray>, exp: Long): Array<LongArray> {
        var result = matrix
        var newMatrix = matrix
        var e: Long = exp
        while (e > 0) {
            if ((e % 2).toInt() == 1) {
                result = multiplyMatrix(result, newMatrix)
            }
            e /= 2
            newMatrix = multiplyMatrix(newMatrix, newMatrix)
        }
        return result
    }

    return if ((n.toInt() == 0) or (n.toInt() == 1)) {
        (1L % mod)
    } else {
        val fibNumber = matrixPow(qMatrix, n - 1)
        (fibNumber[0][0] % mod)
    }
}
