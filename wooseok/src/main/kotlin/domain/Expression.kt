package domain

interface Expression {

    val number: Int
    val operator: Operator
    val isEnd: Boolean

    fun calculate(number: Int): Int
}