
class CalculateModule { // todo 코틀린 컨벤션은 -> 자바와 동일하게 대문자 클래스

    fun plus(a: Int, b: Int) = a + b

    fun minus(a: Int, b: Int) = a - b

    fun multiply(a: Int, b: Int) = a * b

    fun divide (a: Int, b: Int): Int {
        return if (a == 0) {
            0
        } else if (b == 0) {
            error("") // todo 코틀린 에러처리
        } else {
            a / b
        }
    }
}

enum class Operator(order: Int) {
    PLUS(1), MINUS(1), MULTIPLY(2), DIVIDE(2)
}

